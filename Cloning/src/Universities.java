

public class Universities implements Cloneable {
 String UCM;
 String UMKC;
 String UFC;
public void Branch(String UCM, String UMKC, String UFC) {
	this.UCM = UCM;
	this.UMKC = UMKC;
	this.UFC = UFC;
}

public String getUniversities1() {
	return UCM;
}
public void Universities(String UCM) {
	this.UCM = UCM;
}
public String getUNiversities2() {
	return UMKC;
}
public void setUniversities(String UMKC) {
	this.UMKC = UMKC;
}
public String getUniversities3() {
	return UFC;
}
public void setUniversities3(String UFC) {
	this.UFC = UFC;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

 
}
