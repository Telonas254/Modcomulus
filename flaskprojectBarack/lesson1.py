from flask import Flask,render_template
#start
app=Flask(__name__)

@app.route('/greet')

def greet():
    return"Hello,WELCOME TO FLASK"

@app.route('/about')
def about():
    return"WELCOME TO ABOUT PAGE"

@app.route('/login')
def login():
    return render_template('login.html')

@app.route('/register')
def register():
    return render_template('register.html')

@app.route('/')
def home():
    return render_template('home.html')




app.run(debug=True)
#stop
