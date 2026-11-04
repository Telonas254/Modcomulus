# Dictionary->{}
player1={
    "name":"Messi",
    "goals":780,
    "height":1.56,
    "teams":["FC Barcelona","PSG","Inter Miami"],
    "location":{
        "FC Barcelona":"Spain"
    }
}
print(player1["goals"])
print(player1["teams"][1])

player1["teams"][2]="Miami"
print(player1)

# Assignment
student= {
    "Name":"Jerry",
    "Subjects":["Physics","Maths","Computer Studies"],
    "Teachers":{
        "Mr.Muchai":"Physics",
        "Mr.Makato":["Maths","Computer Studies"]
    }
}
# Access the following
    # 1.Maths as a Subject
print(student["Subjects"][1])
    # 2.The second subject taught by Mr.Makato
print(student["Teachers"]["Mr.Makato"][1])

# Congratulations you have learnt 40% of the Python Programming Language