# Interview test task

## Prerequisites
The existing code is unfinished. You have only the codebase.

With the given code you need to answer the next questions before continuing development:
- How do you interpret requirements?
- What improvements do you anticipate in the requirements?
- What is the current level of completion?
- What tasks remain?
- What level of effort is required to finish the task?
- How can you assure your capability to complete the task? (Include code drafts or ToDos as part of your plan)
- Are you able to implement enhancements or fixes at this moment?

During the session it's crucial to comment your actions out loud.
Feel free to use any tools, sources, books, google, check your pet projects, etc.
You could use the same environment as you have in your daily developer routine.

## Task 1.

REST application for conducting surveys.

1) As a User, I want to get a random question
2) As a User, I want to answer a question
3) As a User, I want to get statistics on questions that were answered by me

### Additional requirements:
* As a User, I want to get a random question that wasn't answered by me
* As a User, I want to change my answer

### Additional architecture requirements:
* Resistance to a high load
* Multiple sources of data
* Security vulnerabilities prevention

### JSON Datasource
```json
[
  {
    "id": 1,
    "name": "What is your preferred season?",
    "answers": [
      "Spring",
      "Summer",
      "Fall",
      "Winter"
    ]
  },
  {
    "id": 2,
    "name": "How do you feel about remote work?",
    "answers": [
      "Love it",
      "Prefer office",
      "Neutral"
    ]
  },
  {
    "id": 3,
    "name": "Coffee or Tea?",
    "answers": [
      "Coffee",
      "Tea",
      "Neither"
    ]
  }
]
```

### CVS Datasource
```cvs
"id","name","answers"
1,"What is your preferred season?","Spring;Summer;Fall;Winter"
2,"How do you feel about remote work?","Love it;Prefer office;Neutral"
3,"Coffee or Tea?","Coffee;Tea;Neither"
```

### XML source
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<root>
    <question>
        <id>1</id>
        <name>What is your preferred season?</name>
        <answers>
            <value>Spring</value>
            <value>Summer</value>
            <value>Fall</value>
            <value>Winter</value>
        </answers>
    </question>
    <question>
        <id>2</id>
        <name>How do you feel about remote work?</name>
        <answers>
            <value>Love it</value>
            <value>Prefer office</value>
            <value>Neutral</value>
        </answers>
    </question>
    <question>
        <id>3</id>
        <name>Coffee or Tea?</name>
        <answers>
            <value>Coffee</value>
            <value>Tea</value>
            <value>Neither</value>
        </answers>
    </question>
</root>
```
