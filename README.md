# Local Resource Finder

## I. Overview

This project is a **Local Resource Finder** designed to help users locate valuable resources in their area. Users can register, log in, and search for resources based on predefined categories. Admins, on the other hand, have additional privileges to update the resource list by adding or removing entries based on availability.

### Features:
- **User Functionality:**
  - Register and log in to explore resources.
  - View available resources by category.
- **Admin Functionality:**
  - Update resources: Add new resources or remove unavailable ones.
  - Ensure the information stays relevant and accurate.

---

## II. Object-Oriented Programming (OOP) Principles

This project makes significant use of **OOP principles**:

### 1. **Encapsulation**  
- **Purpose:** Restricts direct access to object properties.
- **Implementation:**  
  - Private fields in `Account.java` and `Resource.java`.
  - Public getter and setter methods for controlled access.

### 2. **Inheritance**  
- **Purpose:** Allows a class to reuse properties and methods of another class.  
- **Implementation:**  
  - `User` and `Admin` classes extend the abstract `Account` class.
  - Both `User` and `Admin` override the `displayMenu()` method.

### 3. **Polymorphism**  
- **Purpose:** Enables a single interface to handle different data types or classes.  
- **Implementation:**  
  - Overridden `displayMenu()` in `User` and `Admin` for customized behavior.
  - Usage of the `instanceof` operator in `Main.java` to differentiate between user roles.

### 4. **Abstraction**  
- **Purpose:** Hides implementation details and shows only essential features.  
- **Implementation:**  
  - The abstract class `Account` defines a structure with `username`, `password`, and an abstract `displayMenu()` method for subclasses to implement.

---

## III. Details of the Chosen SDG

This project aligns with **Sustainable Development Goal (SDG) 11: Sustainable Cities and Communities**, as it helps provide crucial information to community members about local resources.  

### Additional SDGs Addressed:
- **Goal 3:** Good Health and Well-Being (Healthcare resources).
- **Goal 4:** Quality Education (Educational resources).
- **Goal 12:** Responsible Consumption and Production (Food and transportation resources).

---

## IV. Instructions for Running the Program

### General Instructions
- Navigate the program by selecting options with the corresponding number.
- Follow on-screen prompts for entering information.

### **For Users:**
1. **Register and Log In:**
   - Create an account to start using the system.
2. **View Categories:**
   - Select a category to view available resources.
3. **Log Out:**
   - Choose option `2` in the menu to return to the main screen.

### **For Admins:**
1. **Register with Admin Privileges:**
   - Use a password containing `@` to register as an admin.
2. **Log In:**
   - Enter your admin username and password (with `@`).
3. **Manage Resources:**
   - **Add Resources:** Choose option `1` and fill in the details.
   - **Remove Resources:** Choose option `2` and enter the name of the resource to remove.
   - **View Resources:** Choose option `3` and select a category to view.
4. **Log Out:**
   - Choose option `4` to return to the main screen.

---

## V. Future Improvements
- Enhance UI/UX with graphical interfaces.
- Add search functionality for faster resource retrieval.
- Enable multi-user sessions with role-based access control.

---

**Thank you for exploring the Local Resource Finder!**
