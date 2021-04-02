package day03;

public class pra_quiz_7_8 {
 public static void main (String [] adgs) {
	 

			<인스턴스(instance)>
			자바에서 클래스를 사용하기 위해서는 우선 해당 클래스 타입의 객체(object)를 선언해야 합니다.
			이렇게 클래스로부터 객체를 선언하는 과정을 클래스의 인스턴스 화라고 합니다.
			또한, 이렇게 선언된 해당 클래스 타입의 객체를 인스턴스(instance)라고 합니다.1
			즉, 인스턴스란 메모리에 할당된 객체를 의미합니다.

				

		=  왼쪽의 피연산자에 오른쪽의 피연산자를 대입함.
		+= 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
		-=	왼쪽의 피연산자에서 오른쪽의 피연산자를 뺀 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
		*=	왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
		/=	왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
		%=	왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 나머지를 왼쪽의 피연산자에 대입함.
		&=	왼쪽의 피연산자를 오른쪽의 피연산자와 비트 AND 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
		|=	왼쪽의 피연산자를 오른쪽의 피연산자와 비트 OR 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
		^=	왼쪽의 피연산자를 오른쪽의 피연산자와 비트 XOR 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
		<<=	왼쪽의 피연산자를 오른쪽의 피연산자만큼 왼쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
		>>=	왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호를 유지하며 오른쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
		>>>=왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호에 상관없이 오른쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
		++x	먼저 피연산자의 값을 1 증가시킨 후에 해당 연산을 진행함.
		x++	먼저 해당 연산을 수행하고 나서, 피연산자의 값을 1 증가시킴.
		--x	먼저 피연산자의 값을 1 감소시킨 후에 해당 연산을 진행함.
		x--	먼저 해당 연산을 수행하고 나서, 피연산자의 값을 1 감소시킴.
		==	왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 참을 반환함.
		!=	왼쪽의 피연산자와 오른쪽의 피연산자가 같지 않으면 참을 반환함.
		>	왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 참을 반환함.
		>=	왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 참을 반환함.
		<	왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 참을 반환함.
		<=	왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면 참을 반환함.


				
				
<논리 연산자>

		&&	논리식이 모두 참이면 참을 반환함. (논리 AND 연산)
		||	논리식 중에서 하나라도 참이면 참을 반환함. (논리 OR 연산)
		!	논리식의 결과가 참이면 거짓을, 거짓이면 참을 반환함. (논리 NOT 연산)



<비트 연산자>
				
		&	대응되는 비트가 모두 1이면 1을 반환함. (비트 AND 연산)
		|	대응되는 비트 중에서 하나라도 1이면 1을 반환함. (비트 OR 연산)
		^	대응되는 비트가 서로 다르면 1을 반환함. (비트 XOR 연산)
		~	비트를 1이면 0으로, 0이면 1로 반전시킴. (비트 NOT 연산, 1의 보수)
		<<	명시된 수만큼 비트들을 전부 왼쪽으로 이동시킴. (left shift 연산)
		>>	부호를 유지하면서 지정한 수만큼 비트를 전부 오른쪽으로 이동시킴. (right shift 연산)
		>>>	지정한 수만큼 비트를 전부 오른쪽으로 이동시키며, 새로운 비트는 전부 0이 됨.


				
				
<삼항 연산자(ternary operator)>
				
				조건식 ? 반환값1 : 반환값2

	
	
	
<조건문(conditional statements)>
	
				1. if 문
				2. if / else 문
				3. if / else if / else 문
				4. switch 문


	
	
<if 문>
if 문은 조건식의 결과가 참(true)이면 주어진 명령문을 실행하며, 거짓(false)이면 아무것도 실행하지 않습니다.
							if (조건식) {
							 조건식의 결과가 참일 때 실행하고자 하는 명령문;
										}

			if (ch >= 'a' && ch <= 'z') {
				System.out.println("해당 문자는 영문 소문자입니다.");
				}

	 
	 
	 
< if / else 문>
			if (조건식) {
				조건식의 결과가 참일 때 실행하고자 하는 명령문;
			} else {
				조건식의 결과가 거짓일 때 실행하고자 하는 명령문;
			}

					if (ch >= 'a' && ch <= 'z') {
						System.out.println("해당 문자는 영문 소문자입니다.");
					} else {
						System.out.println("해당 문자는 영문 소문자가 아닙니다.");
					}

<switch 문>
			switch 문은 if / else 문과 마찬가지로 주어진 조건 값의 결과에 따라 
					프로그램이 다른 명령을 수행하도록 하는 조건문입니다.
			이러한 switch 문은 if / else 문보다 가독성이 더 좋으며, 
	 		컴파일러가 최적화를 쉽게 할 수 있어 속도 또한 빠른 편입니다.
			하지만 switch 문의 조건 값으로는 int형으로 승격할 수 있는
				(integer promotion) 값만이 사용될 수 있습니다.
			즉, 자바에서는 swich 문의 조건 값으로 
				byte형, short형, char형, int형의 변수나 리터럴을 사용할 수 있습니다.
			또한, 이러한 기본 타입에 해당하는 데이터를 객체로 포장해 주는 래퍼 클래스
				(Wrapper class) 중에서 위에 해당하는 Byte, Short, Character, Integer 클래스의
				객체도 사용할 수 있습니다.
			그리고 enum 키워드를 사용한 열거체(enumeration type)와 
				String 클래스의 객체도 사용할 수 있습니다.
			따라서 switch 문은 if / else 문보다는 사용할 수 있는 상황이 적습니다.

				
			switch (조건 값) {
			case 값1 : 조건 값이 값1일 때 실행하고자 하는 명령문;
										break;
			case 값2 : 조건 값이 값2일 때 실행하고자 하는 명령문;
										break;
			...
			default:
				조건 값이 어떠한 case 절에도 해당하지 않을 때 실행하고자 하는 명령문;
				break;
					}
			각 case 절 및 default 절은 반드시 break 키워드를 포함하고 있어야 합니다.

		
				
				
				
<반복문(iteration statements)>
				
		반복문이란 프로그램 내에서 똑같은 명령을 일정 횟수만큼 반복하여 수행하도록 제어하는 명령문입니다.
		프로그램이 처리하는 대부분의 코드는 반복적인 형태가 많으므로, 가장 많이 사용되는 제어문 중 하나입니다.
		1. while 문
			   while (조건식) {
						조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
					}
		2. do / while 문
				 do {
					조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
				  } while (조건식);
		3. for 문
			 for (초기식; 조건식; 증감식) {
					조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
				}
	 
	 

<break 문>
			break 문은 루프 내에서 사용하여 해당 반복문을 완전히 종료시킨 뒤, 반복문 바로 다음에 위치한 명령문을 실행합니다.
			즉 루프 내에서 조건식의 판단 결과와 상관없이 반복문을 완전히 빠져나가고 싶을 때 사용합니다.
				
				int num = 1, sum = 0;
				while (true) { 	      <---while 무한 루프  sum += num;
					if (num == 100) {    <---숫자가 100과 같으면 break!
						break; 
					}
					num++;     <---------수는 1씩 증가함
						}
						System.out.println(sum);
	 

<메소드(method) 영역>
			메소드(method) 영역은 자바 프로그램에서 사용되는 클래스에 대한 정보와 함께 
			클래스 변수(static variable)가 저장되는 영역입니다.
			JVM은 자바 프로그램에서 특정 클래스가 사용되면 해당 클래스의 클래스 파일(*.class)를 읽어들여, 
	 		해당 클래스에 대한 정보를 메소드 영역에 저장합니다.
				
				
				
				

힙(heap) 영역
			힙(heap) 영역은 자바 프로그램에서 사용되는 모든 인스턴스 변수가 저장되는 영역입니다.
			JVM은 자바 프로그램에서 new 키워드를 사용하여 인스턴스가 생성되면, 해당 인스턴스의 정보를 힙 영역에 저장합니다.
			힙 영역은 메모리의 낮은 주소에서 높은 주소의 방향으로 할당됩니다.

				
				
				
<스택(stack) 영역>
			스택(stack) 영역은 자바 프로그램에서 메소드가 호출될 때 메소드의 스택 프레임이 저장되는 영역입니다.


				
				
				
<배열(array)>
			배열(array)은 같은 타입의 변수들로 이루어진 유한 집합으로 정의할 수 있습니다.
			배열을 구성하는 각각의 값을 배열 요소(element)라고 하며, 배열에서의 위치를 가리키는 숫자를 인덱스(index)라고 합니다.
			자바에서 인덱스는 언제나 0부터 시작하며, 0을 포함한 양의 정수만을 가질 수 있습니다.

				
				
				
<1차원 배열>
			1차원 배열은 가장 기본적인 배열로 다음과 같은 문법에 따라 선언합니다.
				1. 타입[] 배열이름;
				2. 타입 배열이름[];
			타입은 배열 요소로 저장되는 변수의 타입을 명시합니다.
			배열 이름은 배열이 선언된 후에 배열에 접근하기 위해 사용됩니다.
			자바에서는 배열을 만들기 위해 위의 두 가지 방법을 모두 사용할 수 있지만, 될 수 있으면 첫 번째 방법만을 사용하는 것이 좋습니다.
			위와 같이 선언된 배열은 new 키워드를 사용하여 실제 배열로 생성할 수 있습니다.

				배열이름 = new 타입[배열길이];

			배열의 길이는 해당 배열이 몇 개의 배열 요소를 가지게 되는지 명시합니다.
			또한, 다음과 같이 배열의 선언과 생성을 동시에 할 수도 있습니다.

				타입[] 배열이름 = new 타입[배열길이];

			자바에서는 이러한 배열도 모두 객체이므로, 각각의 배열은 모두 자신만의 필드와 메소드를 가지고 있습니다.
			다음 예제는 int형 데이터를 3개 저장할 수 있는 배열을 선언과 동시에 생성하고 있습니다.

			int[] grade1 = new int[3]; // 길이가 3인 int형 배열의 선언 및 생성
			int[] grade2 = new int[3]; // 길이가 3인 int형 배열의 선언 및 생성
			grade1[0] = 85; // 인덱스를 이용한 배열의 초기화
			grade1[1] = 65;
			grade1[2] = 90;
			grade2[0] = 85; // 배열의 길이보다 적은 수의 배열 요소만 초기화
			for (int i = 0; i < grade1.length; i++) {
				System.out.print(grade1[i] + " "); // 인덱스를 이용한 배열로의 접근
			}
			for (int i = 0; i < grade2.length; i++) {
				System.out.print(grade2[i] + " "); // 인덱스를 이용한 배열로의 접근
			}

			실행 결과
			85 65 90
			85 0 0

			위의 예제처럼 0부터 시작하는 인덱스(index)를 이용하면 각각의 배열 요소에 따로 접근할 수 있습니다.
			또한, 배열 grade2처럼 배열의 길이보다 적은 수의 배열 요소만을 초기화할 경우,
			나머지 배열 요소들은 배열의 타입에 맞게 자동으로 초기화될 것입니다.
				
				
				

<배열의 초기화>
			자바에서는 변수와 마찬가지로 배열도 선언과 동시에 초기화할 수 있습니다.
					1. 타입[] 배열이름 = {배열요소1, 배열요소2, ...};
					2. 타입[] 배열이름 = new 타입[]{배열요소1, 배열요소2, ...};
			위의 두 가지 초기화 방법은 완전히 같은 결과를 반환하며, 초기화 블록에 맞춰 자동으로 배열의 길이가 설정됩니다.
			하지만 다음과 같은 경우에는 첫 번째 방법이 아닌 두 번째 방법만을 사용하여 초기화해야 합니다.
					1. 배열의 선언과 초기화를 따로 진행해야 할 경우
					2. 메소드의 인수로 배열을 전달하면서 초기화해야 할 경우
			int[] grade = new int[]{85, 65, 90}; // 길이가 3인 int형 배열을 선언과 동시에 초기화
			int sum = 0;
			for (int i = 0; i < grade.length; i++) {
			    sum += grade[i];
			}
			System.out.println("모든 과목에서 받은 점수의 합은 " + sum + "입니다.");
			System.out.println("이 학생의 평균은 " + (sum / grade.length) + "입니다.");
	 
	 
	 
	 
	 

<2차원 배열(two dimensional array)>
			1. 타입[][] 배열이름;
			2. 타입 배열이름[][];
			3. 타입[] 배열이름[];
				int[][] arr = new int[2][3];
				int k = 10;
				for (int i = 0; i < arr.length; i++) {
				    for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = k;  <---- 인덱스를 이용한 초기화
					k += 10;
				    }
				}
				for (int i = 0; i < arr.length; i++) {
				    for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				    }
				    System.out.println();
				}
			실행 결과
			10 20 30
			40 50 60
			
				위의 예제에서 사용된 arr는 2차원 배열이며, 
	 			arr[i]는 arr의 각 배열 요소로 1차원 배열이 됩니다.
				따라서 arr.length는 2차원 배열인 arr의 배열 요소의 총 개수를 반환하며,
				arr[i].length는 arr의 각 배열 요소인 1차원 배열이 가지고 있는 
					배열 요소의 총 개수를 반환하게 됩니다.
					
					
					
					

<배열의 복사>
			자바에서 배열은 한 번 생성하면 그 길이를 변경할 수 없습니다.
			따라서 더 많은 데이터를 저장하기 위해서는 더욱 큰 배열을 만들고, 
	 		이전 배열의 데이터를 새로 만든 배열로 복사해야 합니다.
			arraycopy(), copyOf() 메소드와 for 문을 이용한 복사는 배열의 길이를 마음대로 늘일 수 있습니다.
			하지만 clone() 메소드는 이전 배열과 같은 길이의 배열밖에 만들 수 없습니다.

			int[] arr1 = new int[]{1, 2, 3, 4, 5};
			int newLen = 10;
			// 1. System 클래스의 arraycopy() 메소드
			int[] arr2 = new int[newLen];
			System.arraycopy(arr1, 0, arr2, 0, arr1.length);
			// 2. Arrays 클래스의 copyOf() 메소드
			int[] arr3 = Arrays.copyOf(arr1, 10);
			// 3. Object 클래스의 clone() 메소드
			int[] arr4 = (int[])arr1.clone();
			// 4. for 문과 인덱스를 이용한 복사
			int[] arr5 = new int[newLen];
							실행 결과
							1 2 3 4 5 0 0 0 0 0
							1 2 3 4 5 0 0 0 0 0
							1 2 3 4 5
							1 2 3 4 5 0 0 0 0 0




<연산자 연습하기>

			 System.out.println(3 + 4.5 * 2 + 27 /8); 

			 System.out.println(true || false && 3 < 4 ||!(5==7));

			 System.out.println(true || (3 < 5 ^ 6 >+ 2)); 
					밑에 노란줄 생기는 애들은 단축식 평가라 앞에 트루면 나머진 안본다는 뜻

			 System.out.println(!true > 'A' );    --->숫자가 아니라서 망함

			 System.out.println(7 % 4 + 3 - 2 /6 *'Z');
				묵시 or 강제 형 변환중에 큰따옴표는 산술 연산에선 못쓰고
				단일문자를 수식에 ''를 씌워서 쓰면 아스키 코드 숫자로 바뀜
				아스키코드 값 때문에 'Z'를 숫자로 인식하는 거임, 

			 System.out.println('D' + 1 +'M' % 2 / 3);

			 System.out.println(5.0 / 3 + 3 / 3);

			 System.out.println("8번 " + (53 % 21 < 45 / 18) );
						53나누기 21 나머지가 45나누기 18보다 커? 라는 뜻

			 System.out.println((4 < 6) || true && false && ( 2 > 3 ));
			 //앞이 트루라 뒤는 버린다 2
			 System.out.println(7 - (3 + 8 * 6 + 3) - (2+ 5* 2));
	 
	 
	 

			System.out.print("May 18, 2021 fell on day number ");
			System.out.println( ( (13 + (13 * 3 - 1) / 5 + 2021 % 100  
			    + 2021 % 100 / 4 + 2021 / 400
			    - 2 * (2021 / 100) ) % 7 + 7) % 7 );
			지정한 연도의 -1 해에 마지막 날 요일을 알아내는 것
			그레고리력 달력 만들 때 쓴다. 0=일 1=월 2=화 이런 식
			계산 결과에 +1을 하면 올해 마지막날의 요일이 됨


			System.out.print( 'H' + 'I' + " is " + 1 +" more example"); 
					  H, I 에도 아스키코드가 먹힘, 출력할 때 숫자로 알아서 변환됨


			System.out.print(); <-- 매개 변수를 받아서 작동하는 애라 빈칸은 오류남 

			System.out.println();  <--ln은 괜찮음

				  
	
증감 연산자
			/증감연산자에서 ++, -- 1만큼 증가 or 감소
			+가 어디 붙냐에 따라 연산순서가 바뀜
			i= 1  ->  i=i+1   ->  i+= 1   ->  ++i 
			i = i+3 -> i+= 3 

			int a = 7, b = 8;	
			int result3 = ++a + 10;  <-- a값을 증가시킨 다음 연산 적용함(전치)
			int result4 = b++ + 10;  <-- a값을 연산 적용하고 나서 증가 값(후치)
			System.out.println("++a + 10 = " + result3);
			System.out.println("b++ + 10 = " + result4);
			주로 전치 사용함


	 
	 
				
	 
	 
	 
 }
}