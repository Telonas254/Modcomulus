# PASSING INFORMATION TO PYTHON FUNCTIONS. 
    # 1. A parameter;A variable passed inside a function during its craetion.
    # 2. An Argument;A value passed while calling a function.

def bmi(weight,height):
    bmi=weight/(height*height)
    print(bmi)

bmi(60,1.6)
bmi(170,0.5)

# Convert SIMPLEST INTEREST FUNCTION with parameters and arguments.
def si(rate,time,principle):
    simple_interest=(rate*time*principle)/100
    print(simple_interest)

si(int(input("Enter the interest rate here: ")),int(input("Please enter the duration provided: ")),int(input("Enter the amount accumulating interest: ")))


