package Day12;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Member {
// 1. �ʵ�[�޸� = ����]
	private String id;
	private String password;
	private String name;
	private String phone;
	// private ���� ������ : �ʵ带 ��ȣ �ޱ� ����[�ٸ� Ŭ���� ������ ���� �Ұ�]
	
// 2. ������
	// �� ������
	public Member() {	}
	
	// ��� �ʵ带 �޴� ������
	public Member(String id, String password, String name, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
// 3. �޼ҵ�
	// 1. private �ʵ� ���� get, set[�ܺ� Ŭ������ ����]
	// 2. �α��� �޼ҵ�
	public void login() {
		
	}
	
	// ȸ������ �޼ҵ�
	public void signup() {
		//0. �Է� ��ü ��������
		Scanner scanner = Day12_Team.scanner;
		
		// 1. �Է�
		System.out.println("---------- ȸ������ ������ ----------");
		System.out.println("���̵� : "); String id = scanner.next();
		System.out.println("��й�ȣ : "); String password = scanner.next();
		System.out.println("�̸� : "); String name = scanner.next();
		System.out.println("����ó : "); String phone = scanner.next();
		
		// 2. ��ü ����
		Member member = new Member(id, password, name, phone);
		
		// * �迭�� ����
		for(int i = 0; i<Day12_Team.member.length; i++) {
			if(Day12_Team.member[i]==null) {
				Day12_Team.member[i] = member; break;
			}
		}
		
		// 3. ��������
			// 1. ȸ����[\n], �ʵ庰[ , ] ���� ����
		// * �迭�� ��� ��ü�� ���� ó�� 
		try {
			for(Member temp : Day12_Team.member) {
				if(temp == null) break;
	// 1. ���� ��� ��ü
		FileOutputStream fileOutputStream =
				new FileOutputStream("C:/Users/505/git/Ezen_Java/Java/src/Day12/MemberList.txt");
		// true�� ���� �̾�� = �ݺ���(for)�� �ȵ����� O 
	// 2. ��ü ��������[�ʵ屸�� (\n: ȸ������ , : �ʵ屸��)]
		String outString = member.id+","+member.password+","+member.name+","+member.phone+"\n";
		fileOutputStream.write(outString.getBytes()); // ����Ʈ �� ��ȯ �� ����
			}
			} catch(Exception e) {
		System.out.println("[�˸�] : ȸ�� DB ���� ���� : " + e);
	}
	}
	
public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}