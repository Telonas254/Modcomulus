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
    print("===Welcome {bank_account['name']}===")
    print("===CHOOSE THE OPTIONS BELOW TO PROCEED===")
    print("1.Check Balance")
    print("2.Withdraw Cash")
    print("3.Deposit")
    print("4.Change Your PIN")
else:
    print("==WRONG PIN!!==")
    print("!!==TRY AGAIN==")

# 1.Change the pin to 2024.
bank_account["pin"]=2024
print(bank_account)
# 2.Update the balance to 10000.
bank_account["balance"]=10000
print(bank_account)
# 3.Show the Director.
print(bank_account["users"]["director"])
# 4.Acces Lucy information.
print(bank_account["users"]["finance"][0])