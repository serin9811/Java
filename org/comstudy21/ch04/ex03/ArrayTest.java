package org.comstudy21.ch04.ex03;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//�Ʒ��� �κ��� ���������� 3�� ������� ���̴�.
		People[] pArr= new People[3];
		
//People ��ü�� ����ó�� �����ϰ� ���.	
//		1.People ��ü�� �����.
//		2.People ��ü�� ���� �Ѵ´�.
//		3.People ��ü�� pArr�� �߰��Ѵ�.	
	
		for (int i =0; i<pArr.length; i++){
			pArr[i] = new People();
			People p = new People();
			p.setIdx(i);
			
			System.out.println("�����Է�:");
			p.setName(scan.next());
			System.out.println("��ȭ��ȣ:");
			p.setPhone(scan.next());
			
			pArr[i] = p;

		}
		System.out.println(Arrays.toString(pArr));
	}

}
