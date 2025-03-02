# learn_django

**A tech blogging website created using Django web framework.**

![techBlog](./img/techBlog.png)

This blogging website provides a platform for users to

- create a post
- save post as a draft and publish later
- comments on post
- approve / reject the comments
- Manage user
- Handle login

## Requirements

python 3.5

## packages

pip install django==1.10

## Steps to run

1. Install requirements
2. git clone git@github.com:nitr-himanshu/learn_django.git

```python
3. python manage.py migrate
4. python manager.py runserver 5000
```

5. Open url 127.0.0.1:5000

## Admin access

- Default admin credentials
  - username : sudo
  - password : himanshu
- To create a new superuser

```python
python manage.py createsuperuser
```
