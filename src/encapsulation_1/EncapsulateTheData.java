package encapsulation_1;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private double degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; //can be any object type except String. Strings get turned into objects.
	
	public int getItems() {
		return itemsReceived;
	}
	public void setItems(int set) {
		if(set < 0) {
			itemsReceived = 0;
		}
		else {
			itemsReceived = set;
		}
	}
	
	public double getDegrees() {
		return degreesTurned;
	}
	public void setDegrees(double d) {
		if(d > 0.0 && d < 360.0) {
			//It worked
			degreesTurned = d;
		}
		else {
			System.err.println("Failed to set variable: Number is too high");
		}
	}
	
	public String getNomen() {
		return nomenclature;
	}
	public void setNomen(String s) {
		if(s.equals("")) {
			nomenclature = " ";
		}
		else {
			nomenclature = s;
		}
	}
	
	public Object getMemberObject() {
		return memberObj;
	}
	public void setMemberObject(Object o) {
		if(o instanceof String) {
			memberObj = (Object) o;
		}
		else {
			memberObj = o;
		}
	}
	public static void main(String[] args) {
		
	}
}
