package exceptionHandling;
class OwnException extends Exception{
	public OwnException(String message) {
		super(message);
	}
}

public class CustomException {
	public static void studentAge(int age) throws OwnException { //throws handles the exception
		if(age<0) {
			throw new OwnException("Age less than zero exception");
		}
		
	}
	public static void main(String[] args) throws OwnException {
		studentAge(-2);
	}

}
