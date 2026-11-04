# Exception handling is a way to handle errors caused at the run time before application crashes.
# in python we use:("Try..except")keywords.

# Division.
while True:
    try:
        value1 = int(input("Enter First Number: "))
        value2 = int(input("Enter Secong Number: "))

        answer = value1/value2
        print(f"The answer is {answer}")
    except:
        print("!!!!!!!!!!Something is wrong with you!!!!!!!!!!!!!")