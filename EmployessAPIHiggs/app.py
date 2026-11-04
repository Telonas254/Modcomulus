# imports
import pymysql
import pymysql.cursors
from flask import *
from flask_restful import Api,Resource
# APP STARTS
app = Flask(__name__)
api = Api(app)
# Resources.
class Employee(Resource):
    def get(self):
        # Retrieve Data from the server
        # No Payload is sent to the server

        # Step1: Connect to the database
        connection = pymysql.connect(host='localhost', user='root', password='', database='higgs')

        cursor = connection.cursor(pymysql.cursors.DictCursor)

        # Step2: Write sql and execute using cursor
        try:
            sql = "select * from employees"
            cursor.execute(sql)
            
            # Step3: Check if data is available
            # If not available, notifythe clisnt(response)
            # Else, retrieve the employees
            count = cursor.rowcount
            if count ==0:
                return jsonify({'response' : 'No Employee'})
            else:
                employee = cursor.fetchall()    
                return jsonify(employee)
        except:
            connection.rollback()
            return jsonify({'ERROR Response':"!!!!!!!!INTERNAL SERVER ERROR!!!!!"})
    def post(self):
        # Post method: Submit data to the server
        # JSON:Format of data transmitted between two systems
        # In APIs, data is called a payload
        payload = request.json
        id_number = payload["id_number"]
        username = payload["username"]
        others = payload["others"]
        salary = payload["salary"]
        department = payload["department"]

        # Database Connection
        connection = pymysql.connect(host='localhost', user='root', password='', database='higgs')

        # Create cursor: execute sql codes
        cursor = connection.cursor()

        # Prepare data 
        data = (id_number, username, others, salary, department)

        # SQL to insert data: table -> employees
        try:
            sql = "insert into employees (id_number, username, others, salary, department) values (%s, %s, %s, %s, %s)" 

            # execute sql and pass data,then commit changes
            cursor.execute(sql, data)
            connection.commit()

            # return response to user
            return jsonify({'response' : 'Employee added successfuly'})
        except:
            connection.rollback()
            return jsonify({'ERROR Response':"!!!!!!!!INTERNAL SERVER ERROR!!!!!"})



    def put(self):
        # Put Request:Modify/Update an existing resource.
        # The existing resources can be identified by primary Key
        # Salary
        # 
        # Step1: Prepare Payload. 
        data = request.json
        id_number = data['id_number']
        salary = data['salary']

        # Step2: Connect to the Database
        connection = pymysql.connect(host='localhost',user='root',password='',database='higgs')

        # Step3:Create Cursor
        cursor = connection.cursor()

        data= (salary,id_number)

        # Step4: Write update SQL and execute using cursor
        try:
            sql="update employees set salary = %s where id_number = %s"

            cursor.execute(sql,data)
            connection.commit()

            # Return Response to user.
            return jsonify({'response':'IMPLEMENTED DETAILS OF EMPLOYEE  Succesfully'})
        except:
            connection.rollback()
            return jsonify({'ERROR Response':"!!!!!!!!INTERNAL SERVER ERROR!!!!!"})


    def delete(self):
        # Delete Request:Remove an existing resource
        # We use primary key to identify the existing resource

        # Step1: Prepare the Payload
        data = request.json
        id_number = data['id_number']

        # Step2: Dtabase connection and Create cursor
        connection = pymysql.connect(host='localhost',user='root',password='',database='higgs')
        cursor = connection.cursor()
        # Step3: Place the payload in a tuple(unchangle) data
        data = (id_number)

        # Step4: SQL-Delete and Execute using cursor
        try:
            sql = "delete from. employees where id_number = %s "
            cursor.execute(sql,data)
            connection.commit()

        # Step5: Commit changes and return Response
            return jsonify({'response':"DELETED EMPLOYEE RECORD Succesfully"})

        except:
            connection.rollback()  
            return jsonify({'ERROR Response':"!!!!!!!!INTERNAL SERVER ERROR!!!!!"})

api.add_resource(Employee,'/employee')


app.run(debug=True)

# APP STOPS
# READ ON EXCEPTION HANDLING:
    # a). Run time errors:
    # EXPLAIN THE fOLLOWING:
        # 1. try..except block
        # 2. finally block
        # 3. else block