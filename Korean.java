package day02;

public class Korean {
	// field
	String nation = "korea";
	String ssn;
	String name;

	// constructor
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	} // this==Korea; --> this.name --> 맴버필드는 객체와 함께 생성되므로 같이 묶어서 생각하면 좋기때문!

	public Korean() {

	}

	public Korean(String nation) {
		this.nation=nation;
	}

	// 생성자 체이닝 
	public Korean(String nation, String name, String ssn) {
		this(nation);
		this.name = name;
		this.ssn = ssn;
	}

	public static void main(String ar[]) {
		Korean k = new Korean("멍멍멍", "1111");

	}

}
