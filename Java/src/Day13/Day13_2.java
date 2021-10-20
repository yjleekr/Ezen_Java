package Day13;

public class Day13_2 {

	public static void main(String[] args) {
		// ������ �켱����
		// P.590
		for(int i=0; i<=10; i++) {
			// 2. ��Ƽ ������ ����[�̸� �ο�]
			Thread thread = new CalcThread("������ "+i);
			System.out.println(i+"��° ������ ����");
			
			// 3. �켱���� ����
			if(i != 10) { // 1~9���� ���� �켱����
				// �ش� �����带 ���� �켱 ������ ����
				thread.setPriority(Thread.MIN_PRIORITY);
			} else { // ���� ������ ��ȣ�� 10�̸� ���� �켱����
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			
			// 4. ������ ����
			thread.start();
		}
		
		// ������ ����ȭ �޼ҵ�
			// ����ȭ : ���������尡 ������ �޼ҵ� �����Ҷ� ���� ������ �޼ҵ� ���� ó�� �������� ���
		Calculator calculator = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}