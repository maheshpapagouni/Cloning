

public class Item implements Cloneable {
	private int Zip;
	private String State;
	private int Strength;
	Universities universities = null;
	public Item(int Zip, String State, int Strength, Universities universities) {
		this.Zip = Zip;
		this.State = State;
		this.Strength = Strength;
		this.universities = universities;
	}
	
	public int getZip() {
		return Zip;
	}
	public void setZip(int Zip) {
		this.Zip = Zip;
	}
	public String getState() {
		return State;
	}
	public void setState(String State) {
		this.State = State;
	}
	public int getStrength() {
		return Strength;
	}
	public void setStrength(int strength, int Strength) {
		this.Strength = Strength;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "State is  " + State + " ZipCode is    " + Zip +" Available Strength is " +  Strength + " University Name is " + universities;
		
	}
	/*@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
*/	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Item items = (Item) super.clone();
		items.universities = (Universities)universities.clone();
		return items;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Item item = (Item)obj;
		if(item != null ) {
			if(this.Zip == item.Zip && this.State == item.State && this.Strength == item.Strength);
			return true;
		}
		return false;
	}
}
