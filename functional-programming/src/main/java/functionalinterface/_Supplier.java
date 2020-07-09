package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {
		
		System.out.println(getDBConnection());
		System.out.println(getDBConnectionSupplier.get());
		
	}

	static String getDBConnection() {
		return "jdbc://localhost:3306/users";
	}
	
	static Supplier<String> getDBConnectionSupplier = () -> "jdbc://localhost:3306/users";
}
