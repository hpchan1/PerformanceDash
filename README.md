# PerformanceDash
### POST /users

Create user

**Query Params**

`id` - number, as a user primary key

`usermane` - string, will fuzzy search using `LIKE '%name%'`

`password` - number, login standard password

`firstname` - string, user name

`lastname` - string, user surname

`role` - string, identify different between `LIKE '%users%'` and `LIKE '%admin%'`

**Sample Response** 
```
[
    {
        "id": xxx,
        "username: xxxxxxxx",
        "password: xxxxxxxx",
        "firstname": "xxxxxxxxxx",
        "lastname": "xxxxxxxxxx",
        "role: xxxxxxxx",
    }
]
```
---
### PUT /users/{id}

**Query Params**

`id` - number, search the user id

`usermane` - string, update username

`password` - number, update password

`firstname` - string, update firstname

`lastname` - string, update lastname

`role` - string, update role

**Sample Response** 
```
[
    {
        "id": xxx,
        "username: xxxxxxxx",
        "password: xxxxxxxx",
        "firstname": "xxxxxxxxxx",
        "lastname": "xxxxxxxxxx",
        "role: xxxxxxxx",
    }
]
```
---
### DELETE /users/{id}

Delete User

**Query Params**

`id` - number, search the user

**Sample Response** 
```
[
    {

    }
]
```
---
### GET /users

Show all users

**Query Params**

`id` - number

`usermane` - string, will fuzzy search using `LIKE '%name%'`

**Sample Response** 
```
[
    {
        "id": 1,
        "username": "Huan Ping",
        "firstname": "Huan Ping",
        "lastname": "Chan",
        "role": "Admin"
        "target": NULL
    },
    {
        "id": 2,
        "username": "Nathiyah",
        "firstname": "Nathiyah",
        "lastname": "Balaiah",
        "role": "Member"
        "target": 1
    },
    {
        "id": 3,
        "username": "Zhi Hao",
        "firstname": "Zhi Hao",
        "lastname": "Lim",
        "role": "Member"
        "target": 1
    }
]
```
---

### GET /users/{id}

Search specific user

**Query Params**

`id` - number, search the user id

`targetId` - number, search the targetid which for the specific user

**Sample Response** 
```
[
    {
        "id": 2,
        "username": "Nathiyah",
        "firstname": "Nathiyah",
        "lastname": "Balaiah",
        "role": "Member",
        "target": 1,
        "status": "Initial State",
        "progress": 10
    }
]
```
---
### DELETE /users/{id}/{targetId}

Delete the target for specific user

**Query Params**

`id` - number, search the user id

`targetId` - number, search the targetid which for the specific user

**Sample Response** 
```
[
    {
        "id": 2,
        "username": "Nathiyah",
        "firstname": "Nathiyah",
        "lastname": "Balaiah",
        "role": "Member",
        "target": NULL
    }
]
```
---
### GET /targets

Show all targets

**Query Params**

`id` - number, search the target id

`userid` - number, search the user id

**Sample Response** 
```
[
    {
        "id": 1,
        "title": "Hello World",
        "userid": 2,
        "username": "Nathiyah_Balaiah",
        "Status" : "Work In Progress",
        "Progress" : 50%
    }
]
```
---
### GET /users/{id}/{targetId}

Show specific user

**Query Params**

`id` - number, search the user id

`targetId` - number, search the target id for the specific user

**Sample Response** 
```
[
    {
        "id": 2,
        "username": "Nathiyah_Balaiah",
        "targetId": 1,
        "Status" : "Work In Progress",
        "Progress" : 50
    }
]
```
---
### PUT /users/{id}/{targetId}
Update the status or progress in the target for specific user

**Query Params**

`id` - number, search the user id

`targetId` - number, search the target id for the specific user

`status` - string, update status

`progress` - number, update progress percent

**Sample Response** 
```
[
    {
        "id": 2,
        "targetId": 1,
        "Status" : "Finish",
        "Progress" : 100
    }
]
```
---




Restfull Format
| method | path | action |
|---|---|---|
| GET | /users | index(user) |
| GET | /users/{id} | show|
| POST| /users | create |
| PUT | /users/{id} | update |
| DELETE | /users/{id} | delete |
| GET | /users/{id}/projescts | index(projest) |

### GET /users

List all users, can be searched or sorted


**Query Params**

`id` - number, as a user primary key 

`usermane` - string, will fuzzy search using `LIKE '%name%'`

`password` - number, login standard password

`firstname` - string, user name 

`lastname` - string, user surname

`role` - string, identify different between `LIKE '%users%'` and `LIKE '%admin%'`

**Sample Response** 

```
[
    {
        "id": 1,
        "username": "Huan Ping",
        "firstname": "Huan Ping",
        "lastname": "Chan",
        "role": "Admin",
    
    }
]


[
    {
        "id": 2,
        "username": "Zhi Hao",
        "firstname": "Zhi Hao",
        "lastname": "Lim",
        "role": "User",
    }
]

[
    {
        "id": 3,
        "username": "Nathiyah",
        "firstname": "Nathiyah",
        "lastname": "Balaiah",
        "role": "User",
    }
]
```



## User

#### POST

- user able to create the target page 

- POST /targets (create target) 

```
[
    {
        "id": 2,
        "username": "Zhi Hao",
        "firstname": "Zhi Hao",
        "lastname": "Lim",
        "role": "User",
        "Targer" : "create the page on terget"
    }
]
```
#### PUT

- user able to update the information on target page

- PUT /targets/{id} (update tagret)

```
[
    {
        "id": 2,
        "username": "Zhi Hao",
        "firstname": "Zhi Hao",
        "lastname": "Lim",
        "role": "User",
        "Target" : "update the information"
    }
]
```

#### GET

- user able to view the user infromation

- GET /users/{id}/{targetId} (show specific user target)

```
[
    {
        "id": 2,
        "username": "Zhi Hao",
        "firstname": "Zhi Hao",
        "lastname": "Lim",
        "role": "User",
        "Target" : "get the user in formation"
    }
]
```

#### GET

- user able to view all the information 

- GET /targets (show all target)


```
[
    {
        "id": 2,
        "username": "Zhi Hao",
        "firstname": "Zhi Hao",
        "lastname": "Lim",
        "role": "User",
        "Target" : "view all the informations"
    }
]
```






