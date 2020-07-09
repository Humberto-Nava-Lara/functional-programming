package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Without predicate");
		System.out.println(isPhoneNumberValid("07000000000"));
		System.out.println(isPhoneNumberValid("0700000000"));
		System.out.println(isPhoneNumberValid("09000485232"));
		
		System.out.println("With predicate");
		System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
		System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
		System.out.println(isPhoneNumberValidPredicate.test("09000485232"));
		
		System.out.println("Is phone number valid and contains number 3 = " + isPhoneNumberValidPredicate.and(containsNumber3).test("07000000000"));
	
		System.out.println("Is phone number valid and contains number 3 = " + isPhoneNumberValidPredicate.and(containsNumber3).test("07000000003"));
	}

	static Boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
	}
	
	static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;
	
	static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}
