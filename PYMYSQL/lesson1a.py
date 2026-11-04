# pymysql python library:Used to interact with MYSQL RDMS
# ImportError:Terminal -> pip3 install pymysql
import pymysql
import flask

# 1.Database connection
    # a).Host:Where? ->localhost
    # b).User:Who? ->root
    # c).Password:secured? ->''
    # d).Database:Which? ->Pick Your Database with excactly the same name as the one in xampp
connection=pymysql.connect(host='localhost',user='root',password='',database='HiggsBarackDB')
print("Connected Successfully")

# Python Insert Query
name="Dennis Mutinda"
date="2022=09-19"
pay=64300
dept=4

# Create a cursor to execute SQL COMMANDS IN PYTHON  
cursor=connection.cursor()
data=(name,date,pay,dept)
sql="insert into employees (emp_name,hire_date,salary,dept_id) values(%s,%s,%s,%s)"
cursor.execute(sql,data)
connection.commit()
print("!!!!!!!!!!!!!!!!!!!!RECORD ADDED SUCCESSSFULLY!!!!!!!!!!!!!!!")
# END

# Python Insert Query
name="Cid Kagenou"
date="2018-10-19"
pay=66000
dept=3

# Create a cursor to execute SQL COMMANDS IN PYTHON  
cursor=connection.cursor()
data=(name,date,pay,dept)
sql="insert into employees (emp_name,hire_date,salary,dept_id) values(%s,%s,%s,%s)"
cursor.execute(sql,data)
connection.commit()
print("!!!!!!!!!!!!!!!!!!!!RECORDS ADDED SUCCESSSFULLY!!!!!!!!!!!!!!!")
# END
