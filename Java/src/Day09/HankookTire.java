package Day09;

public class HankookTire extends Tire {

	 // extends(�����ϴ�) ���
	// �ʵ�
	
	// ������
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	// �޼ҵ�
	// �������̵� : �޼ҵ� ������[�޼ҵ� ���빰 �ٲٱ�]
	@Override
		public boolean roll() {
		++accumultedRoration; // ���� ȸ���� ����
		if(accumultedRoration < maxRotation) { // �ִ� ȸ�� �� �� ũ��
			System.out.println(location + "HankookTire ���� : "
		+ (maxRotation-accumultedRoration) + "ȸ"); // ���� ���� ���
			return true; // true ������ ������ ǥ���ϴ� ��ȯ
		} else { // �ִ� ȸ������ �� ������
			System.out.println("***" + location + "HankookTire ��ũ ***");
			return false; // false ������ ������ ǥ���ϴ� ��ȯ
		}
	}
}