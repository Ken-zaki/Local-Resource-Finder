<div align="center">
    <a href="https://github.com/Ken-zaki" target="_blank">
        <img src="https://github.com/user-attachments/assets/e84486d4-79ad-4c12-8605-5d24cd397edb" 
        alt="Logo" width="290" height="290">
    </a>
</div>

# 🌍 Local Resource Finder 🗺️  

## I. Overview 📋

This project is a **Local Resource Finder** 🎯 intended to help users locate valuable resources 🏗️ around their area 🏡 and find out where they're located 📍.

- **For Users** 👥: All users must **register first** 📝, and after that, they can find resources 🔍 based on the categories provided 📑. The program will display the **available resources** 📜 within the selected category.  
- **For Admins** 🛠️: Admins can update resources 🖊️ — for example, remove resources 🗑️ when unavailable or re-add them 🔄 when they become available again.

---

## II. Object-Oriented Programming (OOP) Principles 🧑‍💻  

### **Encapsulation** 🔒  
- Achieved by using **private** access modifiers in `Account.java` and `Resource.java`.  
- This restricts 🔐 direct access to the properties of these classes.  
- Data is accessed or modified using **public getter and setter methods** 🛡️, ensuring better control and security.  

**Account.java**
```java
   private String username;
   private String password;
```

**Resource.java**
```java
    private String category; 
    private String name;
    private String location;
    private String details;
```
### **Inheritance** 🧬  
- The `User` 👤 and `Admin` 🛠️ classes inherit from the **abstract class** `Account.java` using the `extends` keyword 📂.  
- Both subclasses **override** 🔄 the `displayMenu()` method to provide their specific implementations 🎨.  

**Account.java**
```java
    public abstract class Account{}
```
**Using extends** 
```java
    //user
    class User extends Account{}
    //admin
    class Admin extends Account{}
```
### **Abstraction** 🧩  
- The `Account.java` class is declared as **abstract** 📄.  
- It provides a common structure (`username`, `password`) 🗝️ and declares an **abstract method** `displayMenu()` 📜.  
- Subclasses (`User` 👥 and `Admin` 🛠️) provide their **unique implementation** of `displayMenu()` 🎯.  

**Account.java** 
```java
    public abstract class Account{}
```
**displayMenu()**
```java
    public abstract void displayMenu();
```
### **Polymorphism** 🌀  
- The `displayMenu()` method in `Account` is **overridden** in `User` and `Admin` classes for specific functionalities ⚙️.  
- The `instanceof` operator in `Main.java` is used to check whether an object belongs to `User` or `Admin` 🔎, allowing behavior to change dynamically 💡.  

**Account.java**
```java
         class User extends Account { 

            public User(String username, String password) {
                  super(username, password); 
            }
            @Override
            public void displayMenu() {
                  System.out.printf("User");
            }
         }

         class Admin extends Account {
            
            public Admin(String username, String password) {
               super(username, password);
            }
            @Override
            public void displayMenu() {
               System.out.printf("Admin");
            }
         } 
```
**Main.java**
```java
      if (accounts[i] instanceof User){ 
            userMenu((User) accounts[i]);
      } else if (accounts[i] instanceof Admin) {
            adminMenu((Admin) accounts[i]);
      }
```
---

## III. Details of the Chosen SDG 🌱  

This project aligns with **GOAL 11: Sustainable Cities and Communities** 🏙️, supporting efforts to provide essential community needs 🏡 and ensuring accessible information ℹ️.  
It also aligns with other SDGs 🌟:  
- **GOAL 3: Good Health and Well-being** 🏥  
- **GOAL 4: Quality Education** 📚  
- **GOAL 12: Responsible Consumption and Production** ♻️  

---

## IV. Instructions for Running the Program 🖥️  

### General Instructions 🛠️  
- **Navigate the program** by selecting options with the corresponding number 🔢.  
- Follow the **on-screen prompts** 📖 for entering information.  


## How to Use the Program 🕹️

Below is an illustration of how to use the program.

---

### **For Users** 👥:  

🔴 **REGISTER AND LOGIN** 📝  
🔴 After logging in, **choose a category** 📂 from the available options.  
🔴 The program will display all available resources 🗂️ in that category.  
🔴 To **logout**, choose option 2️⃣, and you'll return to the main menu 🔙.

![How to Use](https://github.com/user-attachments/assets/4cb9e40e-cf10-4d02-89f4-4ef310e00f40)
![How to Use](https://github.com/user-attachments/assets/dfc272c5-ba24-449f-a89c-a684adbdee0d)
![How to Use](https://github.com/user-attachments/assets/f9b0a233-3e97-4e5e-9ee5-0b83d3a432b9)

---

### **For Admins** 🛠️:  

🟢 Register using a **password containing `@`** 🛡️ to identify as an admin.  
🟢 Login using your admin credentials 🔑.  
🟢 Admin menu options:  
   - **Add Resource** ➕: Choose 1️⃣, then fill out the required information 🖊️.  
   - **Remove Resource** ➖: Choose 2️⃣, then specify the resource to remove 🗑️.  
   - **View Resources** 👁️: Choose 3️⃣, then select a category to view 📋.  
🟢 To logout, choose option 4️⃣ and return to the main menu 🔙.  

![How to Use](https://github.com/user-attachments/assets/cee1f233-2973-4c6a-a402-ebaf386fa872)
![adui](https://github.com/user-attachments/assets/8b5e1eba-422a-4014-9e23-4a826c51e5ee)
![adaddre](https://github.com/user-attachments/assets/63c93b43-3920-4499-a5ee-f0b98a526933)
![lookafteradd](https://github.com/user-attachments/assets/6795b199-3a93-4dc6-9279-683f12eb9997)
![revad](https://github.com/user-attachments/assets/6e265f3f-b57a-4203-ad9c-68729d8fc39c) 


---

**🎉 Thank you for exploring the Local Resource Finder! 🌟 We hope it helps you connect with the resources you need. 🛠️🌿**
