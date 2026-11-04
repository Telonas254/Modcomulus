# Using python conditions:
    # 1.Request a year from the keyboard(int).
    # 2.Test whether the year is a leap year or not.
# Algorithm:
    # A leap year is divisible by 4 and not 100.
        # If it is divisible by 4 and 100,then it has to be divisible by 400. e.g"2024","2020","2000","2016"
leap_years=[]
Not_leap_years=[]
while True:
    years=int(input("Enter Year to be tested: "))
    if years%400==0:
         leap_years.append(years)
    else:      
         if years%4==0:
            leap_years.append(years)
         else:
           Not_leap_years.append(years)
    print((Not_leap_years))        
    print((leap_years))
