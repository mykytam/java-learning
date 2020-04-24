package functional.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
            (customer, showPhoneNumber) -> System.out.println("Hello " + customer.customerName + ", phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "******"));
    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello " + customer.customerName + ", phone number " + customer.customerPhoneNumber);

    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "999999");
        // Usual Java function
        greetCustomer(maria);
        // Consumer Functional interface, takes 1 argument, returns nothing
        greetCustomerConsumer.accept(maria);
        // Consumer Functional interface, takes 2 argument, returns nothing
        greetCustomerConsumerV2.accept(maria, false);
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", phone number " + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
