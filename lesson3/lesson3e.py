# NHIF Premium Rates
grossincome=int(input("Please Enter Your Gross Salary: "))
if grossincome>=1000 and grossincome<=5999:
    print("Monthly Contribution 150.00")
elif grossincome>=6000 and grossincome<=7999:
    print("Monthly Contribution 300.00")
elif grossincome>=8000 and grossincome<=11999:
    print("Monthly Contribution 400.00")
elif grossincome>=12000 and grossincome<=14999:
    print("Monthly Contribution 500.00")
elif grossincome>=15000 and grossincome<=19999:
    print("Monthly Contribution 600.00")
elif grossincome>=20000 and grossincome<=24999:
    print("Monthly Contribution 750.00")
elif grossincome>=25000 and grossincome<=29999:
    print("Monthly Contribution 850.00")
elif grossincome>=25000 and grossincome<=49999:
    print("Monthly Contribution 1000.00")
elif grossincome>=50000 and grossincome<=99999:
    print("Monthly Contribution 1500.00")
elif grossincome>=100000:
    print("Monthly Contribution 2000.00")
else:
    print("!!!YOU DO NOT QUALIFY TO CONTRIBUTE HERE!!!")