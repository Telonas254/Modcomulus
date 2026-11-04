counties=["Nairobi","Kajiado","Kiambu","Makueni","Kisumu","Wajir","Tana River","Tharaka Nithi","Usain Gishu","Taita Taveta"]
single=[]
double=[]
for names in counties:
    if " "in names:
        double.append(names)
    else:
        single.append(names)
print(single)            
print(double)





