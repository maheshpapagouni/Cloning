

public class DeepClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Universities universities = new Universities();
		Item item = new Item(664134, "Missouri",20000, universities);
		Item itemShallowClone = (Item)item.clone(); 
		//Deep copy will create new reference and store the details
		//It is used to share the same properties of different objects 
		//Deep copy is independent on other objects
		//System.out.println(item.equals(itemShallowCopy)); 
		//Does it show same values or different values
		/*System.out.println(item.toString());
		System.out.println(itemShallowCopy.toString());*/
		//In deep copy, if you try change one object it will not make any changes in other object
		item.universities.UCM = "KansasCity";
		System.out.println(item.universities.UCM);
		System.out.println(itemShallowClone.universities.UCM);

	}

}
