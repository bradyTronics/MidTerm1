
public class Faculty extends Employee {
	private String OfficeHours;
	private String Rank;
	
	public Faculty(String officeHours, String rank){
		this.OfficeHours = officeHours;
		this.Rank = rank;
	}
	
	public String getOfficeHours() {
		return OfficeHours;
	}
	public void setOfficeHours(String officeHours) {
		OfficeHours = officeHours;
	}
	public String getRank() {
		return Rank;
	}
	public void setRank(String rank) {
		Rank = rank;
	}
}
