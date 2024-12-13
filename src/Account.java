public abstract class Account { // using abstract class 
    private String username;
    private String password;

    public Account(String username, String password) { // set the constructor parameters 
        this.username = username;
        this.password = password;
    }

    public String getUsername() { // using getter method to get the specified username
        return username;
    }
    public String getPassword() {
        return password;
    }

    public abstract void displayMenu(); //A placeholder method that must be overridden by subclasses.
}
class User extends Account { // use extend to inherit from parent class
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
