# Creating a Function
# Syntax:(
    # def "function_name()":
        # body
# )

def greeting():
    print("Hello,there!")

def sum():
    first=56
    second=30
    answer=first+second
    print(answer)

sum()
# Create a function that can do simple interest.(r*t*p/100)   
def si():
    rate=int(input("Enter the interest rate here: "))
    time=int(input("Please enter the duration provided: "))
    principle=int(input("Enter the amount accumulating interest: "))
    simple_interest=(rate*time*principle)/100
    print(simple_interest)

si()
