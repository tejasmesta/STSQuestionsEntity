**PROBLEM STATEMENT**: Create a CRUD backend API for a QUESTIONS entity. The entity can contain question, options, correctAnswer. Use any database, language framework etc of your choice.
<br><br>
This project is built using the SPRING TOOL SUITES (STS) platform with following features:- <br>                                                                                       1) Get all questions<br>                                                                                                                                                         2) Read a specific question with given id <br>                                                                                                                                   3) Add a question to the API <br>                                                                                                                                                 4) Updating a question already present in the API  <br>                                                                                                                           5) Deleting a question already present in the API <br><br>     

**GET ALL Questions:-**<br> 

url --> localhost:8080/Questions <br>
[<br>
&emsp;    {<br>
&emsp;&emsp;       "options": {<br>
&emsp;&emsp;&emsp;            "a": "Mumbai",<br>
&emsp;&emsp;&emsp;            "b": "New Delhi",<br>
&emsp;&emsp;&emsp;            "c": "Kolkata",<br>
&emsp;&emsp;&emsp;            "d": "Jaipur"<br>
&emsp;&emsp;       },<br>
&emsp;&emsp;&emsp;         "id": 1,<br>
&emsp;&emsp;&emsp;         "question": "What is India's capital",<br>
&emsp;&emsp;&emsp;         "answer": "New Delhi"<br>
&emsp;    },<br>
&emsp;     {<br>
&emsp;&emsp;         "options": {<br>
&emsp;&emsp;&emsp;            "a": "Pune",<br>
&emsp;&emsp;&emsp;            "b": "Banglore",<br>
&emsp;&emsp;&emsp;            "c": "Kanpur",<br>
&emsp;&emsp;&emsp;            "d": "Jaipur"<br>
&emsp;&emsp;         },<br>
&emsp;&emsp;&emsp;        "id": 2,<br>
&emsp;&emsp;&emsp;        "question": "Which city is known as Pink city",<br>
&emsp;&emsp;&emsp;        "answer": "Jaipur"<br>
&emsp;    }<br>
]
<br><br>
**GET SPECIFIC Question:-** <br> 

url --> localhost:8080/Questions/2(questionId) <br>
[<br>
    {<br>
&emsp;       "options": {<br>
&emsp;&emsp;            "a": "Mumbai",<br>
&emsp;&emsp;            "b": "New Delhi",<br>
&emsp;&emsp;            "c": "Kolkata",<br>
&emsp;&emsp;            "d": "Jaipur"<br>
&emsp;       },<br>
&emsp;&emsp;         "id": 1,<br>
&emsp;&emsp;         "question": "What is India's capital",<br>
&emsp;&emsp;         "answer": "New Delhi"<br>
    },<br>
]
<br><br>

**ADD Question:-** <br> 

url --> localhost:8080/add <br>
<br><br>

**UPDATE Question:-** <br> 

url --> localhost:8080/update <br>
<br><br>

**DELETE Question:-** <br> 

url --> localhost:8080/Questions/2(questionId) <br>
<br><br>
