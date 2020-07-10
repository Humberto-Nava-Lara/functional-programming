package combinatorpattern;

import java.time.LocalDate;

import combinatorpattern.CustomerRegistrationValidator.ValidationResult;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer("Alice", "alicegmail.com", "+071542134545", LocalDate.of(1990, 1, 1));

		//Without combinator pattern
		
		System.out.println(new CustomerValidatorService().isValid(customer));
		
		//With combinator pattern
		
		ValidationResult result = isEmailValid().and(isPhoneNumberValid()).and(isAnAdult()).apply(customer);
		
		System.out.println(result);
		
		if(result != ValidationResult.SUCCES) {
			throw new IllegalStateException(result.name());
		}
	}

}
