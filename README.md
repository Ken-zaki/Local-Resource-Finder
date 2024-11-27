# Local Resource Finder

## I. Overview

- This project is a local resource finder wherein intended to find a good resources founnd around the area and where it located, this project have a user where all users need to register first and they can now find resources based on the category given and it will show the available resources on that given category. on the other side i made an admin to update the resources, for example is that the resources is not available so they can remove the resources information , and also they can add the resources again if its available again.

---

## II. Object-Oriented Programming (OOP) Principles

- In this project OOP principle have a significant use to work this project.By using encapsulation using private in account.java and resource.java is restrict the direct access to some of an objects and it will be accessed or modify by using public getter methods. By using inheritance it allows a class to acquire the properties and methods to anotherclass by using extends on the user and admin to inherit from the abstract class account.java, and both classes user and admin override the display menu method from the parent class account. By using polymorphism i used it a lot, example in displayMenu() overriden both user and admin class to provide the specific implementation from parent class, the other one is using instanceof operator in main.java to check if the user is admin or user. lastly by using abstraction focus on exposing only essential details and hiding implimentation details, as example is i used it in account.java i declared as abstract it provide a common structure (username, password) and a method signature abstract void displayMenu() for subclasses but defer implementation to them.
  
---

## III. Details of the Chosen SDG

This project align in GOAL 11 sustainable cities and community, it support given to provide necessary needs of the community and also give the information to the people that they have a organization that they can rely on. This project also align to other SDG such as GOAL 3, GOAL 4, and GOAL 12.

---

## IV. Instructions for Running the Program

### General Instructions
- Navigate the program by selecting options with the corresponding number.
- Follow on-screen prompts for entering information.

### **For Users:**

    - REGISTER AND LOGIN
    - AFETR LOGIN THERES A CHOICES ONLY TO VIEW THE CATEGORY
    - CHOOSE THE DESIRE CATEGORY
    - IT WILL SHOW ALL THE AVAILABLE INFORMATION IN THAT CATEGORY
    - IF YOU WANT TO LOGOUT CHOOSE 2 AND YOU WILL BE BACK TO MAIN MENU

### **For Admins:**

    - REGISTER THE PASSWORD MUST HAVE @ AS A SIGN AS ADMIN WILL BE RESGISTER
    - LOGIN BY USING YOUR USERNAME AND PASSWORD WITH @ ON IT
    - THERES A CHOICES ADD, REMOVE AND VIEW 
    - IF YOU WANT TO ADD, CHOOSE 1 THEN FILL THE INFORMATION NEEDED
    - IF YOU WANT TO REMOVE, CHOOSE 2 THEN FILL THE NAME YOU WANT TO REMOVE
    - IF YOU WANT TO VIEW, CHOOSE 3 THEN SELECT YOU WANT CATEGORY TO VIEW
    - IF YOU WANT TO LOGOUT CHOOSE 4 AND YOU WILL BE BACK TO MAIN MENU


**Thank you for exploring the Local Resource Finder!**
