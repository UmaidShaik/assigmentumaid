package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CustomerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for customer " + i + ":");

            System.out.print("Customer ID: ");
            int custId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Name: ");
            String name = scanner.nextLine();

            String email;
            do {
                System.out.print("Email: ");
                email = scanner.nextLine();
                if (!isValidEmail(email)) {
                    System.out.println("Invalid email format! Please try again.");
                }
            } while (!isValidEmail(email));

            System.out.print("Password: ");
            String password = scanner.nextLine();

            customers.add(new Customer(custId, name, email, password));
        }

        System.out.println("\nDisplaying customer information in ascending order of names:");
        Collections.sort(customers, Comparator.comparing(Customer::getName));
        for (Customer customer : customers) {
            customer.displayCustomerInfo();
            System.out.println();
        }

        scanner.close();
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }
}