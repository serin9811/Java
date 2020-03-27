package org.comstudy21.ch04.ex4;

import java.util.Scanner;
import org.comstudy21.ch04.ex03.People;

public class Ch04Ex06 {
	public static final int MAX = 100;
	private People[] pArr = new People[MAX];
	private int top = 0;
	// (top <MAX)
	private int sequence = 0; // ���Ҿ��� ��� ����; idx�� ���.
	public static final Scanner scan = new Scanner(System.in);
	private int thatNum = 0;

	public Ch04Ex06() {
		System.out.println("����Ʈ ������ ȣ��!");

		while (true) {
			run();
		}
	}

	public void run() {
		switch (menu()) {
		case 1:
			input();
			break;
		case 2:
			output();
			break;
		case 3:
			System.out.println("�˻����...");
			search();
			break;
		case 4:
			edit();
			break;
		case 5:
			System.out.println("�������...");
			delete();
			break;
		case 6:
			System.out.println("����");
			System.exit(0);
			break;
		default:
			System.out.println("�ش���� ����!");
		}
		System.out.println("--------------");
	}

	// pArr �� People ��ü �߰�
	public void input() {

		if (top >= pArr.length) {
			System.out.println("���̻� �Է��� �Ұ���!");
			return;
		}

		// 1.��ü����
		People p = new People();

		// 2.��ü�� ������ �ֱ�
		p.setIdx(sequence++);
		System.out.println("�Է±��...");
		System.out.println("�����Է�: ");
		p.setName(scan.next());
		System.out.println("����ó �Է�: ");
		p.setPhone(scan.next());

		// 3.��ü�� �迭�� top������ ���
		pArr[top++] = p;
	}

	public void output() {
		System.out.println("��±��...");
		// pArr�� ��Ҹ� top���� �ݺ��ؼ� ���
		for (People p : pArr) {
			if (p == null)
				break;
			System.out.println(p);
		}

	}

	// pArr����
	public void search() {

		System.out.println("�˻��Ϸ��� ����� �̸��� �Է��ϼ���.");
		String searchName = scan.next();
		try{
			
			int i = 0;
			while (i < top) {
				if (pArr[i].getName().equals(searchName)) {
					System.out.println(pArr[i]);
					thatNum = i;
					return;
				}
				i++;
			}
		}
		catch(Exception E){
			System.out.println("�����Ϳ� �������� �ʴ� �̸��Դϴ�!");
		}
	}

	public void edit() {
		System.out.println("�������...");
		search();
		System.out.println("�����Ϸ��� �������� ��ȣ�� �Է��ϼ���. 1.�̸� , 2.����ó");
		String editType = scan.next();
		if (editType.equals("1")) {
			System.out.println("�����Ϸ��� �̸��� �Է��ϼ���.");
			pArr[thatNum].setName(scan.next());
			;
			System.out.println("������ �������ϴ�!");
		} else if (editType.equals("2")) {
			System.out.println("�����Ϸ��� ����ó�� �Է��ϼ���");
			pArr[thatNum].setPhone(scan.next());
			System.out.println("������ �������ϴ�!");
		} else {
			System.out.println("�����Ϸ��� ����� �����Ͱ� �����ϴ�! ");
		}
	}

	public void delete() {

		search();
		System.out.println(thatNum);
		System.out.println("�����Ϸ��� �������� �ε�����ȣ�� �Է��ϼ���");
		int deleteNum = scan.nextInt();
		pArr[deleteNum] = null;
		if (deleteNum < top) {
			for (int j = deleteNum; j < top; j++) {
				for (int l = deleteNum + 1; l < j; l++) {
					pArr[j].setIdx(pArr[l].getIdx());
					pArr[j].setName(pArr[l].getName());
					pArr[j].setPhone(pArr[l].getName());
				}
			}
		} else if (deleteNum == top) {
			top = deleteNum - 1;
		}
		System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
	}

	public int menu() {
		int no = 0;
		System.out.println("1.�Է�  2.���  3.�˻� 4.���� 5.���� 6.����");
		System.out.println("���� : ");
		no = scan.nextInt();
		return no;
	}

	public static void main(String[] args) {
		new Ch04Ex06();

	}

}
