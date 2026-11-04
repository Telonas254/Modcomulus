# Area of Rectangle width=5,length=8
width=5
lenght=8
area=width*lenght
print(area)

# Volume of a Sphere radius=21m
# 4/3*3.142*21*21*21
radius=21
pi=3.142
fraction=4/3
volume=fraction*pi*radius*radius*radius
print(volume)

# Practice Questions
#1. Volume of a cylinder with radius of 10 and height of 15 
# Formular=(pi*radius*radius*height)
radius2=10
pi2=3.142
height=15
volume_cylinder=pi*radius*height*radius
print(volume_cylinder)


# 2.Body Mass Index with weight of 69kgs and height of 1.73m:weight/(height*height)
weight=69
height2=1.73
height3=height2*height2
bodymass=weight/height3
print(bodymass)

# 3.Circumference
radius_circle=20
pie=3.142
num=2
circumference=radius_circle*num*pie
print(circumference)

# Three Primary Data Types
# 1.String Data type:They have double Quotes e.g->str()
# 2.Integers:NUMBERS WITHOUT A DECIMAL->int()
# 3.Floats:Numbers with decimal places e.g height=1.67 ->float()
# 4.Input:Is used to get data from the user keyboard

radius=int(input("Please Enter Radius: "))
circumference=2*3.142*radius
print(circumference)

# Write a BMI Program by requesting the weight and the height from the use->float
weight=int(input("Please Enter your Weight: "))
height=int(input("Please Enter your Height: "))
heightdouble=height*height
basalmetabolicrate=weight/heightdouble
print(basalmetabolicrate)

