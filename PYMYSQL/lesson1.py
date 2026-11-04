# pymysql
import pymysql
# Database connections
# NB: Make sure xamp server is running
# host -> where?
# user -> who has access? default(root)
# password -> Is it secured? default(empty)
# database -> which database? NB:use exact words on xamp
connection = pymysql.connect(host='localhost', user='root', password='', database='kifaruWinstoneDB')

name = "Joseph Mwangi"
date = "2011-03-05"
salary = 30000
dept = 6

cursor = connection.cursor()
data = (name, date, salary, dept)
sql = "insert into employees (emp_name, hire_date, salary, dept_id) values (%s, %s, %s, %s)"
cursor.execute(sql, data)
connection.commit()
# DONE