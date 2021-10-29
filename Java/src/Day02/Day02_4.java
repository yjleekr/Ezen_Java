package Day02;

import java.util.Scanner;

public class Day02_4 {

	public static void main(String[] args) {
		// 문제1 : 급여 명세서 
		/*
		 * [조건] 입력받기 : 기본급 , 수당 
		 * [출력] 실수령액 = 기본급 + 수당 - 세금[ 기본급10% ]
		 * 
		 */
		// 1. 입력객체 선언 = Scanner 클래스를 이용한 객체 선언
		Scanner A = new Scanner(System.in);
		//2. 입력객체에 저장된 값을 변수로 옮기기
		System.out.println("기본급 : "); int 기본급 = A.nextInt();
		System.out.println("수량 : "); int 수량 = A.nextInt();
		// 3. 계산
		// 100% → 1 	10% → 0.1 	1% → 0.01
		int 세금 = (int)(기본급 * 0.1); // int * double
		System.out.println("실수령액 : " + (기본급+수량-세금));
		
		// 문제2 : 지폐 개수 세기 
		/*
		 * [조건] : 십만원 단위의 금액을 입뭐騁 
		 * [출력] : 입력받은 금액의 지폐수 세기 
		 * [출력 예 ] : 356789  
		 * 		십만원 : 3장 
		 *		만원 : 5장 
		 * 		천원 : 6장 
		 * 		백원 : 7개
		 */
		// 1. 지폐 입력 받기
		System.out.println("금액 : "); int 금액 = A.nextInt();
		// 10만원 권
		System.out.println("10만원 : " + (금액/100000) + "장");
		// 금액 = 금액 - (금액/100000) * 1000000;
		금액 -= (금액/100000) * 1000000; // 10만원 단위 제거
		// 2. 만원 권
		System.out.println("만원 : " + (금액/10000) + "장");
		금액 -= (금액/10000) * 10000; // 만원 단위 제거
		// 3. 천원 권
		System.out.println("천원 : " + (금액/1000) + "장");
		금액 -= (금액/1000) * 1000; // 천원 단위 제거
		// 4. 백원 권
		System.out.println("백원 : " + (금액/100) + "개");
		
		
		
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
		System.out.println("문제3 정수 입력 : ");	int 문제3 = A.nextInt();
		// 배수찾기
		// 갑 % 수 == 0 나머지가 0 이면 같은 그 수의 배수 ← 배수 찾기의 식
		System.out.println("7의 배수인지 : " + (문제3%7 == 0));
		
		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
		System.out.println("문제4 정수 입력 : ");	int 문제4 = A.nextInt();
		// 홀수 찾기
		// 값 % 2 == 1 나누기 2를 했을때 나머지가 0이면 값은 짝수 1이면 홀수
		System.out.println("홀수인지 : " + (문제4%2 == 1));
		
		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
		System.out.println("문제5 정수 입력 : ");	int 문제5 = A.nextInt();
		System.out.println("7의 배수이면서 짝수 인지 : " + (문제5%7 == 0 && 문제5%2==0));

		//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
		System.out.println("문제6 정수1 입력 : ");	int 문제6_1 = A.nextInt();
		System.out.println("문제6 정수2 입력 : ");	int 문제6_2 = A.nextInt();
		System.out.println("정수1 > 정수2 크다 : " + (문제6_1 > 문제6_2));
		
		//문제7 : 반지름을 입력받아 원 넓이 출력하기 
			// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
		System.out.println("문제7 반지름 입력 : ");	double 문제7 = A.nextDouble();
		System.out.println("원 넓이는 : " + (문제7*문제7*3.14));
		
		//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
			// 예) 54.5   84.3 이면    64.285714%
		System.out.println("문제8 실수 입력 : ");	double 문제8_1 = A.nextDouble();
		System.out.println("문제8 실수 입력 : ");	double 문제8_2 = A.nextDouble();
		double 비율 = (문제8_1/문제8_2) * 100;
		System.out.println("실수1의 실수2의 백분율 : " + 비율 + "%");
		// 
		System.out.printf("실수1의 실수2의 백분율 : " + "%.2f%%", 비율);
									// 형식문자 : %f(실수)
									// %.숫자f (숫자 : 소수점 자리수)
									// %.2f (소수점 2자리수)
		
		//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
			//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
		System.out.println("문제9 윗변 입력 : ");	double 윗변 = A.nextDouble();
		System.out.println("문제9 밑변 입력 : ");	double 밑변 = A.nextDouble();
		System.out.println("문제9 높이 입력 : ");	double 높이 = A.nextDouble();
		System.out.printf("사다리꼴 계산식 : %.2f \n" , (윗변*밑변)*높이/2);
		
		//문제10: 키를 정수를 입력받아 표준체중 출력하기
			//표준체중 계산식 = > (키 - 100) * 0.9
		System.out.println("문제10 키 입력 : ");	double 키 = A.nextDouble();
		System.out.println("표준체중 계산식 : " + (키-100) * 0.9);
		
		//문제11: 키와 몸무게를 입력받아 BMI 출력하기
			//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		System.out.println("문제11 몸무게 입력 : ");	double 몸무게 = A.nextDouble();
		System.out.println("BMI : %.1f \n" + (몸무게 / (키/100) * (키/100)));
		
		//문제12: inch 를 입력받아 cm 로 변환하기 [1인치당 2.54]
		System.out.println("Inch 입력 : ");	double inch = A.nextDouble();
		System.out.println("Inch → Cm 변환 : " + (inch*2.54));
		
		//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
			//소수 둘째 자리 까지 점수 출력하기
			//중간고사 반영비율 => 30 %
			//기말고사 반영비율 => 30 %
			//수행평가 반영비율 => 40 %
		System.out.println("문제13 중간고사 입력 : ");	double 중간 = A.nextDouble();
		System.out.println("문제13 기말고사 입력 : ");	double 기말 = A.nextDouble();
		System.out.println("문제13 수행평가 입력 : ");	double 수행 = A.nextDouble();
		중간 *= 0.3; 기말 *= 0.3; 수행 *= 0.4;
				System.out.printf("반영비율 : %.2f \n" + (중간+기말+수행));
				
		//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
		 	//int x = 10;
			//int y = x-- + 5 + --x;
			//printf(" x의 값 : %d , y의값 :  %d ", x, y)
				// 1. x--, +5 	→ 10 + 5
				// 2. x-- 		10 → 9 // 더하고 나서 감소가 됨
				// 3. --x 		9 → 8
				// 4. 15 + 8	23
				
	}

}
