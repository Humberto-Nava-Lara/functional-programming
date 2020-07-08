package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {
		//Normal java function
		Customer maria = new Customer("Maria","99999");
		
		greetCustomer(maria);
		
		greetCustomerV2(maria, false);
		
		//Consumer functional interface
		greetCustomerConsumer.accept(maria);
		
		greetCustomerConsumerV2.accept(maria, false);
	}
	
	static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.custumerName +", thanks for registering phone number " + customer.customerPhoneNumber);
	
	static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> System.out.println("Hello " + customer.custumerName +", thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "*****"));
	
		
	static void greetCustomer(Customer customer) {
		System.out.println("Hello " + customer.custumerName +", thanks for registering phone number " + customer.customerPhoneNumber);
	}
	
	static void greetCustomerV2(Customer customer, Boolean showPhoneNumber) {
		System.out.println("Hello " + customer.custumerName +", thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "*****"));
	}
	
	static class Customer {
		private final String custumerName;
		private final String customerPhoneNumber;
		
		public Customer(String custumerName, String customerPhoneNumber) {
			this.custumerName = custumerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}
	}
}
