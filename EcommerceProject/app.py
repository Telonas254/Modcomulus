from flask import * 

# START
app=Flask(__name__)
app.secret_key="hg gvcccwjhvfdlgxhhf"

@app.route('/')
def home():
    # Step 1:DATABASE CONNECTION
    import pymysql
    connection= pymysql.connect(host='localhost',user='root',password='',database='higgs_flask_db')
    
    # Step 2:CREATE CURSOR->Added to the connection used to execute SQL QUERIES
    cursor=connection.cursor()

    # Fetch Products based on Categories
         # 1.Electronics
    sql_electronics="select * from products where product_category='Electronics'"
    cursor.execute(sql_electronics)
    data_electronics=cursor.fetchall()
        # 2.Fashion
    sql_fashion="select * from products where product_category='Fashion'"
    cursor.execute(sql_fashion)
    data_fashion=cursor.fetchall()
         # 3.Furniture
    sql_furniture="select * from products where product_category='Furniture'"
    cursor.execute(sql_furniture)
    data_furniture=cursor.fetchall()
        # 4.Accesories
    sql_accesories="select * from products where product_category='Accesories'"
    cursor.execute(sql_accesories)
    data_accesories=cursor.fetchall()
    
    # end home
    return render_template('home.html',electronics=data_electronics,fashion=data_fashion,furniture=data_furniture,accesories=data_accesories)

@app.route('/upload',methods=['POST','GET'])
def upload():
    if request.method =='POST':
        product_name=request.form["product_name"]
        product_desc=request.form["product_desc"]
        product_cost=request.form["product_cost"]
        product_category=request.form["product_category"]
        product_image_name=request.files["product_image_name"]

        # save image-> static/images/
        product_image_name.save('static/images/' + product_image_name.filename)

        # database connection
        import pymysql
        connection=pymysql.connect(host='localhost',user='root',password='',database='higgs_flask_db')

        # Create Cursor():Execute sql codes
        cursor=connection.cursor()
        data=(product_name,product_desc,product_cost,product_category,product_image_name.filename)

        # SQL Query
        sql="insert into products (product_name,product_desc,product_cost,product_category,product_image_name) values(%s,%s,%s,%s,%s)"

        # USE CURSOR TO EXECUTE SQL THEN PROVIDE DATA ON THE PLACELDERS
        cursor.execute(sql,data)
        # UPDATING (COMMITTING) CHANGES IN THE DATABASE
        connection.commit()

        # RETURN SUCCESS MESSAGE
        return render_template('upload.html',message="!!!!!!!===!!!!!Added Successfully!!!!!===!!!!!!!!!")

    else:
        return render_template('upload.html',message='Please Add Product Information.')


@app.route('/single/<product_id>')
def single(product_id):
    # Step1:DTABASE CONNECTION
    import pymysql
    connection=pymysql.connect(host='localhost',user='root',password='',database='higgs_flask_db')
    # Step 2:Create a Connection cursor():SQL EXECUTE
    cursor=connection.cursor()
    # Write the SQL query
    sql="select * from products where product_id=%s"
    # Execute
    cursor.execute(sql,(product_id))
    data=cursor.fetchone()
    # Return Server Response
    return render_template('single.html',single=data)



@app.route('/register', methods = ['POST', 'GET'])
def register():
    if request.method == 'POST':
        user_name = request.form["user_name"]
        phone = request.form["phone"]
        email = request.form["email"]
        user_image_name = request.files["user_image_name"]
        password = request.form["password"]
        confirm = request.form["confirm"]


        # save image: static/users/
        user_image_name.save('static/images/' + user_image_name.filename)
        # connect to database
        import pymysql
        connection = pymysql.connect(host='localhost', user='root', password='', database='higgs_flask_db')

        # create cursor(): Execute sql Queries
        cursor = connection.cursor()
        data = (user_name, phone, email, user_image_name.filename, password)

        # sql to insert a record
       
        # check some condition before executing sql
        # 1.password and confirm are same
        if password != confirm:
            return render_template('register.html', warning = 'Passwords Dont Match!')
        elif len(password) <8:
            return render_template('register.html', Warning = 'Password Is Less Than 8 Characters')
        else:
            sql="insert into users(user_name,phone,email,user_image_name,password) values(%s,%s,%s,%s,%s)"
            cursor.execute(sql, data)
            connection.commit()
            from sms import send_sms
            send_sms(phone,f"!!!!!!Karibu Sana{user_name}!!!!!!!")
            return render_template('register.html', success = 'You have been Registered Successfully')
       
    else:
        return render_template('register.html', message = 'please add your information')
    



@app.route('/login', methods = ['POST', 'GET'])
def login():
    if request.method == 'GET':
        return render_template('login.html', message = 'Please Enter Information')
    elif request.method == 'POST':
        user_name = request.form["user_name"]
        password = request.form["password"]
    
       
        # connect to database
        import pymysql
        connection = pymysql.connect(host='localhost', user='root', password='', database='higgs_flask_db')

        # create cursor(): Execute sql Queries
        cursor =connection.cursor()
        data = (user_name, password)
        
        sql = "select * from users where user_name = %s and password = %s"
        cursor.execute(sql, data)
        
        # MAKE A DECISION
        # cursor.rowcount
        if cursor.rowcount == 0:
            return render_template('login.html', warning = 'Invalid Credentials')
        else:
            # fetch information
            user = cursor.fetchone()
            session["key"] = user[1]
            session["phone"] = user[2]
            session["image"] = user[4]
            return redirect('/')


@app.route('/logout')
def logout():
    session.clear()
    return redirect('/login')

@app.route('/mpesa',methods=['POST'])
def mpesa():
    phone=request.form["phone"]
    amount=request.form["amount"]

    from mpesa import stk_push
    stk_push(phone,amount)
    return render_template('payment.html')


@app.route('/vendors',methods=['POST','GET'])
def vendors():
    if request.method == 'POST':
        firstname=request.form["firstname"]
        lastname=request.form["lastname"]
        county=request.form["county"]
        password=request.form["password"]
        confirm=request.form["confirm"]
        email=request.form["email"]

        import pymysql
        connection=pymysql.connect(host='localhost',user='root',password='',database='HiggsBarack_Flask')

        # create cursor
        cursor=connection.cursor()
        data=(firstname,lastname,county,password,email)

        # password conditions
        if password!=confirm:
            return render_template('vendors.html',warning='Passwords Do not Match')
        elif len(password) <8:
            return render_template('vendors.html',warning='Password Must be at least 8 characters long')
        else:
            sql="insert into vendors(firstname,lastname,county,password,email) values(%s,%s,%s,%s,%s)"
            cursor.execute(sql,data)
            connection.commit()
            return render_template('vendors.html', success = 'Vendor has been Added Successfully')     
    else:
        return render_template('vendors.html', message='PLease add the relevant information')
    

@app.route('/vlogin', methods = ['POST', 'GET'])
def vlogin():
    if request.method == 'GET':
        return render_template('vlogin.html', message = 'Please Enter Information')
    elif request.method == 'POST':
        firstname = request.form["firstname"]
        password = request.form["password"]
       
        # connect to database
        import pymysql
        connection = pymysql.connect(host='localhost', user='root', password='', database='HiggsBarack_Flask')

        # create cursor(): Execute sql Queries
        cursor =connection.cursor()
        data = (firstname,password)
        
        sql = "select * from vendors where firstname = %s and password = %s"
        cursor.execute(sql, data)
        
        # MAKE A DECISION
        # cursor.rowcount
        if cursor.rowcount == 0:
            return render_template('vlogin.html', warning = 'Invalid Credentials')
        else:
            vendors = cursor.fetchone()
            session["name"] = vendors[0]
            return redirect('/')
        

app.run(debug=True)
# END