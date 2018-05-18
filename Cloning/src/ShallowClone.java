

public class ShallowClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Universities universities = new Universities();
		Item item = new Item(66213, "Kansas", 54980, universities);
		Item itemShallowClone = (Item)item.clone(); 
		//Shallow copy will reference the existing object in the memory
		//It is used to share the same properties of different objects
		//Instead of creating new objects, it will used to store into 
		System.out.println(item.equals(itemShallowClone));
		//print methods 
		//Does it show same values or different values
		/*System.out.println(item.toString());
		System.out.println(itemShallowCopy.toString());*/
		//In shallow copy, if you try change one object it will make changes in other object
		item.universities.UCM = "University of Central Missouri";
		System.out.println(item.universities.UCM);
		System.out.println(itemShallowClone.universities.UCM);
		
	}

}
