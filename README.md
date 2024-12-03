# Local Resource Finder

## I. Overview

- This project is a local resource finder wherein intended to find a good resources founnd around the area and where it located, this project have a user where all users need to register first and they can now find resources based on the category given and it will show the available resources on that given category. on the other side i made an admin to update the resources, for example is that the resources is not available so they can remove the resources information , and also they can add the resources again if its available again.

---

## II. Object-Oriented Programming (OOP) Principles

 **Encapsulation**
     -Encapsulation is achieved by using private access modifiers in Account.java and Resource.java.
     -This restricts direct access to the properties of these classes.
     -The data can only be accessed or modified through public getter methods, ensuring better control and security.
 **Inheritance**
     -The User and Admin classes inherit from the abstract class Account.java using the extends keyword.
     -Both subclasses override the displayMenu() method to provide their specific implementations.
 **Abstraction**
     -The Account.java class is declared as abstract.
     -It provides a common structure (e.g., username, password) and declares an abstract method displayMenu().
     -The implementation of displayMenu() is deferred to the subclasses User and Admin.
 **Polymorphism**
     -The displayMenu() method in Account is overridden in User and Admin classes to provide unique functionality.
     -The instanceof operator in Main.java is used to check whether a given object is of type User or Admin. This determines the behavior dynamically at runtime.
  
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
