package problem1;

public class Owner {
	private String name;
	private String cellPhone;
	public Owner(String n1,String n2){
		this.name = n1;
		this.cellPhone = n2;
	}

	public boolean equals(Object obj){
		if(obj instanceof Owner){
			Owner tmp = (Owner)obj;
		if(this.name.equals(tmp.name))
			return true;
		else
			return false;
		}
		else{
			return false;
		}
	}
	public String toString()
	{
		return "이름은 "+this.name+" 이고 "+"핸드폰 번호는 "+this.cellPhone+" 입니다.";
	}
}
