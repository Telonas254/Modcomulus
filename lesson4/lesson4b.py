even=[]
odd=[]
num2=2
for num in range(21):
    number=num%num2
    if number==0:
        even.append(num)
    else:
        odd.append(num)    
print(even)
print(odd)        