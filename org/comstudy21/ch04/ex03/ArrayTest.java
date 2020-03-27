package org.comstudy21.ch04.ex03;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//아래의 부분은 참조변수가 3개 만들어진 것이다.
		People[] pArr= new People[3];
		
//People 객체에 데이처를 저장하고 출력.	
//		1.People 객체를 만든다.
//		2.People 객체에 값을 넘는다.
//		3.People 객체를 pArr에 추가한다.	
	
		for (int i =0; i<pArr.length; i++){
			pArr[i] = new People();
			People p = new People();
			p.setIdx(i);
			
			System.out.println("성명입력:");
			p.setName(scan.next());
			System.out.println("전화번호:");
			p.setPhone(scan.next());
			
			pArr[i] = p;

		}
		System.out.println(Arrays.toString(pArr));
	}

}
