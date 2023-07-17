package assignment;

class Customer {
    private int custId;
    private String name;
    private String email;
    private String password;

    public Customer(int custId, String name, String email, String password) {
        this.custId = custId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getters
    public int getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setCustId(int custId) {
        this.custId = custId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email format! Email not updated.");
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Validation for email format
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }

    // Method to display customer information
    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + custId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}

