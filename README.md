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

### **Inheritance** 🧬  
- The `User` 👤 and `Admin` 🛠️ classes inherit from the **abstract class** `Account.java` using the `extends` keyword 📂.  
- Both subclasses **override** 🔄 the `displayMenu()` method to provide their specific implementations 🎨.  

### **Abstraction** 🧩  
- The `Account.java` class is declared as **abstract** 📄.  
- It provides a common structure (`username`, `password`) 🗝️ and declares an **abstract method** `displayMenu()` 📜.  
- Subclasses (`User` 👥 and `Admin` 🛠️) provide their **unique implementation** of `displayMenu()` 🎯.  

### **Polymorphism** 🌀  
- The `displayMenu()` method in `Account` is **overridden** in `User` and `Admin` classes for specific functionalities ⚙️.  
- The `instanceof` operator in `Main.java` is used to check whether an object belongs to `User` or `Admin` 🔎, allowing behavior to change dynamically 💡.  

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

### **For Users** 👥:  

🔴 **REGISTER AND LOGIN** 📝  
🔴 After logging in, **choose a category** 📂 from the available options.  
🔴 The program will display all available resources 🗂️ in that category.  
🔴 To **logout**, choose option 2️⃣, and you'll return to the main menu 🔙.  

### **For Admins** 🛠️:  

🟢 Register using a **password containing `@`** 🛡️ to identify as an admin.  
🟢 Login using your admin credentials 🔑.  
🟢 Admin menu options:  
   - **Add Resource** ➕: Choose 1️⃣, then fill out the required information 🖊️.  
   - **Remove Resource** ➖: Choose 2️⃣, then specify the resource to remove 🗑️.  
   - **View Resources** 👁️: Choose 3️⃣, then select a category to view 📋.  
🟢 To logout, choose option 4️⃣ and return to the main menu 🔙.  

---

**🎉 Thank you for exploring the Local Resource Finder! 🌟 We hope it helps you connect with the resources you need. 🛠️🌿**
