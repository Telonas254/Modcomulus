# Start
from flask import *
app=Flask(__name__)
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
        data=(firstname,lastname,county,password,confirm,email)

        # password conditions
        if password!=confirm:
            return render_template('vendors.html',warning='Passwords Do not Match')
        elif len(password) <8:
            return render_template('vendors.html',warning='Password Must be at least 8 characters long')
        else:
            sql="insert into vendors(fistname,lastname,county,password,confirm,email) values(%s,%s,%s,%s,%s)"
            cursor.execute(sql,data)
            connection.commit()
            return render_template ('vendors.html' success='Vendor added Succesfully')
    else:
        return render_template('vendors.html', message='PLease add the relevant information')
    
app.run(debug=True)
# END


