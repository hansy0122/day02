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
	} // this==Korea; --> this.name --> �ɹ��ʵ�� ��ü�� �Բ� �����ǹǷ� ���� ��� �����ϸ� ���⶧��!

	public Korean() {

	}

	public Korean(String nation) {
		this.nation=nation;
	}

	// ������ ü�̴� 
	public Korean(String nation, String name, String ssn) {
		this(nation);
		this.name = name;
		this.ssn = ssn;
	}

	public static void main(String ar[]) {
		Korean k = new Korean("�۸۸�", "1111");

	}

}
