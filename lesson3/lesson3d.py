# Python if...elif...else conditions.
# It is used when we have multiple conditions to check.

# Grading Sytem
    # 0-40->E
    # 41-50->D
    # 51-60->C
    # 61-70->B
    # 71-100->A
    # nvalid Marks is <0 and >100

marks=int(input("Please Enter Marks?"))
if marks>=0 and marks<=40:
    print("Grade E")
elif marks>=41 and marks<=50:
    print("Grade D")
elif marks>=51 and marks<=60:
    print("Grade C")
elif marks>=61 and marks<=70:
    print("Grade B")
elif marks>=71 and marks<=100:
    print("Grade A")
else:
    print("INVALID MARKS!!")