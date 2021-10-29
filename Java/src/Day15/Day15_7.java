package Day15;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Day15_7 {

	/*
	 * ���� Ʈ�� : �ϳ��� ��� �������� ����, ������ �ڽ� ��� ����
	 * 	�θ��� �������� ���� ���� ����, ū ���� ������
	 */
		// Ʈ����.frist() : ���� ���� ���[���� ���� ��]
		// Ʈ����..last() : ���� ������ ���[���� ū ��]
	
	public static void main(String[] args) {
		// 1. ����Ʈ�� ��ü ����
		TreeSet<Integer> scores = new TreeSet<>();
		
		// 2. ����Ʈ���� ��ü�ֱ�
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		// 3. 
		System.out.println("���� ���� ���� : " + scores.first());
		System.out.println("���� ���� ���� : " + scores.last());
		System.out.println("95�� �Ʒ� ���� : " + scores.lower(95));
		System.out.println("95�� �� ���� : " + scores.higher(95));
		System.out.println("93�� �̰ų� �ٷ� �Ʒ� ���� : " + scores.floor(93)); // floor�� �̰ų�
		System.out.println("85�� �̰ų� �ٷ� �� ���� : " + scores.ceiling(85));
		
		// 4. ��������
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for(int score : descendingSet) {
			System.out.println(scores + "     ");
		}
		System.out.println();
		
		// 4-1. ��������
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for(int score : descendingSet) {
			System.out.println(scores + "     ");
		}
		
		while(! scores.isEmpty()) {
		scores.pollFirst(); // ���� ���� ���� ����
		System.out.println("���� ��ü�� : " + scores.size());
		}
	}
}