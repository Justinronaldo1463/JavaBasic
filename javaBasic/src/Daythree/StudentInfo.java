package Daythree;

public class StudentInfo {
	 private int sId;
	 private String sName;
	 private String sCity;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	@Override
	public String toString() {
		return "StudentInfo [sId=" + sId + ", sName=" + sName + ", sCity=" + sCity + "]";
	}
	
	

}
