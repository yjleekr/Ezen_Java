package Day07; // ���� Ŭ������ ��Ű�� ��ġ

// �ٸ� ��Ű���κ��� Ŭ���� ��������
import java.util.Random;
import java.util.Scanner;
import Day06.Student; // import ��Ű�� ��.Ŭ����

public class Day07_1 {
	// Day06 : Ŭ����[���赵 : �ڷ��� �����]
	// 1. �ɹ�(���û��� O �ʼ� X)
		// - �ʵ� : ������ ����[�޸� �Ҵ�(����, ��ü)]
		// - ������ : ������ �ʱⰪ[��ü �ʵ� �ʱⰪ]
		// - �޼ҵ� : ������ ����, �ൿ
		// ��ȯŸ��(int) �޼ҵ��(�μ�1, �μ�2, �μ�3 ~) {return ��ȯ��}
	
	// 2. ��ü(Ŭ������ �ν��Ͻ�) ����
		// Ŭ������ ��ü�� (�ƹ��ų� ��� ����)
			// ��ü�� = new ������(); �� �ν��Ͻ�
		// ��ü�� �ɹ� ����[��ü�� . �ɹ�(�ʵ�, ������, �޼ҵ�)���ٿ�����]
	
	public static void main(String[] args) {
		// P.236
		
		// P.238
		double result = 10*10*Calculator.p1;
				// �ش� Ŭ������ �ɹ� ���� ���
					// 1. ��ü ����[�ش� Ŭ�����κ��� �޸� �Ҵ�]
					// 2. static[��������] : ���α׷� ���۽� �޸� �Ҵ�[main ���ຸ�� �켱]
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result2);
		
		// P.245
		Person p1 = new Person("123456-1234567", "���");
		
		System.out.println(p1.nation+" "+p1.ssn+" "+p1.name+" ");
		
		// �ʵ� ����[final �ʵ�� �����Ұ� �� ��������]
		// p1.nation = "usa";
		// p1.ssn = "654321-7654321";
		p1.name = "��������";
		
		// P.253 import : �ٸ� �������κ��� Ŭ���� �������� Ű����
		// 1. import ��Ű����.Ŭ������ [Ŭ���� �ܺο� �ۼ�]
		// 2. ��Ű����. Ŭ������ ��ü��; [Ŭ���� ���ο� �ۼ�]
	}
}