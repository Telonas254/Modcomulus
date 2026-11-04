# List Array Data Type
counties=["Nairobi","Kajiado","Kiambu","Makueni","Kisumu","Wajir"]
print(type(counties))

# Properties of a List:Ordered,Modifiable/Mutable,Allows Duplicates
# 1.Ordered:Each item is given a unique number called "INDEX"
    # We use [index_number]to access an item starting from zero.
print(counties[2])
# Display fourth item on the list.
print(counties[3])

# Range:A portion of a list:fullcolon
    # Syntax:First index is included,last index is excluded
print(counties[1:3])
print(counties[1:5])

# 2.Modifiable:CRUD->Create,Read,Update,Delete  
    # create->append()
counties.append("Nyandarua")
print(counties)
    # update
counties[0]="Taita Taveta"
print(counties)
    # delete
counties.pop()    
print(counties)

counties.remove("Wajir")
print(counties)

# 3.Allows Duplicate
counties.append("Kiambu")
print(counties)


# Nested lists
client=["John","john@gmail.com",["0712345678","0798765432"]]
# Print the client email
print(client[1])
# Print the client second number
print(client[2][1])


player1=["Bob",["Mercedes","Subaru"],["player1@gmail.com",["2024","2025"]]]
# 1.Print the Email
print(player1[2][0])
# 2.Print the Mercedes
print(player1[1][0])
# 3.Print 2024
print(player1[2][1][0])
