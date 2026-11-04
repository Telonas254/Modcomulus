# Data Types Practice Questions

bank_account={
    "Status":True,
    "name":"Modcom Institute",
    "pin":1234,
    "balance":2000,
    "branch":"Westlands",
    "users":{
        "director":"Mr.Steve",
        "finance":["Lucy","James"],
    }
}

print("====WELCOME TO ABC BANK====")
requested_pin=int(input("Please Enter Your PIN Here: "))
if requested_pin==bank_account["pin"]:
    print(f"===Welcome{bank_account['name']}===")
    print("===CHOOSE THE OPTIONS BELOW TO PROCEED===")
    print("1.Check Balance.")
    print("2.Withdraw Cash")
    print("3.Deposit")
    print("4.Change Your PIN")

    option=int(input("Enter Option Here: "))
    if option==1:
        print("Checking Balance...")
        print("==SUCCESS==")
        print(f"===Your Account Balance Is{bank_account['balance']}===")
    elif option==2:
        print("Comming Soon!!!")    
    elif option==3:
        print("Comming Soon!!!")    
    elif option==4:
        print("Comming Soon!!!")  
    else:
        print("Invalid Choice Try Again!!!")              
else:
    print("==WRONG PIN!!==")
    print("!!==TRY AGAIN==")

print(f"===Welcome{bank_account['name']}===")