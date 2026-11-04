variable1=50
variable2=30

print(variable1<variable2)
print(variable1!=variable2)

username="admin"
password="qwerty"

requested_username=str(input("Enter Username Here: "))
requested_password=str(input("Enter Password Here: "))

if not ((username==requested_username) and password==requested_password):
    print("!!!!CONGRATS!!!")
    print("====ACCESS GRANTED====")
else:
    print("HMMMMMM!")
    print("!!WE APPEAR TO BE HAVING AN ISSUE WITH REGISTERING YOU.ACCESS DENIED!!!!")
