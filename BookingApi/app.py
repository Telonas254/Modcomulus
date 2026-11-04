import pymysql
import pymysql.cursors
from flask import*
from flask_restful import Api,Resource
# start
app=Flask(__name__)
api=Api(app)

class UserRegister(Resource):
    def post(self):
        # post request:Send data to the server
        # the data must ber in jason format
        #Step1:Prepair the data to be sent
        data=request.json
        username=data['username']
        email=data['email']
        password=data['password']
     
        connection=pymysql.connect(host='localhost',user='root',password='',database='booking_db')
        cursor=connection.cursor()
        # Step3:Store data in a tuple(unmodifiable),then write sql
        data=(username,email, password)
        sql="insert into users (username,email, password) values(%s,%s,%s)"

        cursor.execute(sql, data)
        connection.commit()
        return jsonify({'response':"User registered Successfully"})
    

class UserLogin(Resource):
    def post(self):
        data=request.json
        username=data['username']
        password=data['password']

        connection=pymysql.connect(host='localhost',user='root',password='',database='booking_db')
        cursor=connection.cursor()

        data=(username,password)

        sql = "select * from users where username = %s and password = %s"
        cursor.execute(sql, data)
        if cursor.rowcount == 0:
            return jsonify({'message': 'Invalid Credentials'})
        else:
            return jsonify({
                'message': 'Success',
                'code': 1
            })
        
class MakeBooking(Resource):
    def post(self):
        # post request:Send data to the server
        # the data must ber in jason format
        #Step1:Prepair the data to be sent
        data=request.json
        booking_date=data['booking_date']
        booking_type=data['booking_type']
        booking_desc=data['booking_desc']
     
        connection=pymysql.connect(host='localhost',user='root',password='',database='booking_db')
        cursor=connection.cursor()
        # Step3:Store data in a tuple(unmodifiable),then write sql
        data=(booking_date, booking_type,booking_desc)
        sql="insert into bookings (booking_date, booking_type,booking_desc) values(%s,%s,%s)"

        cursor.execute(sql, data)
        connection.commit()
        return jsonify({'response':"Booking Recieved."})
    




api.add_resource(UserRegister,'/user_register')
api.add_resource(UserLogin,'/user_login')
api.add_resource(MakeBooking,'/make_booking')
app.run(debug=True)



# FINISH THE API: LOCAL ENVIRONMENT
# NEXT: API HOSTING -> Python Anywhere Account
# IMPLEMWENT THE ACTIVITIES ON ANDROID STUDIO



