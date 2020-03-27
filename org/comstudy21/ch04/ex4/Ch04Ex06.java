package org.comstudy21.ch04.ex4;

import java.util.Scanner;
import org.comstudy21.ch04.ex03.People;

public class Ch04Ex06 {
	public static final int MAX = 100;
	private People[] pArr = new People[MAX];
	private int top = 0;
	// (top <MAX)
	private int sequence = 0; // 감소없이 계속 증가; idx에 사용.
	public static final Scanner scan = new Scanner(System.in);
	private int thatNum = 0;

	public Ch04Ex06() {
		System.out.println("디폴트 생성자 호출!");

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
			System.out.println("검색기능...");
			search();
			break;
		case 4:
			edit();
			break;
		case 5:
			System.out.println("삭제기능...");
			delete();
			break;
		case 6:
			System.out.println("종료");
			System.exit(0);
			break;
		default:
			System.out.println("해당사항 없음!");
		}
		System.out.println("--------------");
	}

	// pArr 에 People 객체 추가
	public void input() {

		if (top >= pArr.length) {
			System.out.println("더이상 입력이 불가능!");
			return;
		}

		// 1.객체생성
		People p = new People();

		// 2.객체에 데이터 넣기
		p.setIdx(sequence++);
		System.out.println("입력기능...");
		System.out.println("성명입력: ");
		p.setName(scan.next());
		System.out.println("연락처 입력: ");
		p.setPhone(scan.next());

		// 3.객체를 배열의 top번지에 담기
		pArr[top++] = p;
	}

	public void output() {
		System.out.println("출력기능...");
		// pArr의 요소를 top까지 반복해서 출력
		for (People p : pArr) {
			if (p == null)
				break;
			System.out.println(p);
		}

	}

	// pArr에서
	public void search() {

		System.out.println("검색하려는 사람의 이름을 입력하세요.");
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
			System.out.println("데이터에 존재하지 않는 이름입니다!");
		}
	}

	public void edit() {
		System.out.println("수정기능...");
		search();
		System.out.println("수정하려는 데이터의 번호를 입력하세요. 1.이름 , 2.연락처");
		String editType = scan.next();
		if (editType.equals("1")) {
			System.out.println("수정하려는 이름을 입력하세요.");
			pArr[thatNum].setName(scan.next());
			;
			System.out.println("수정이 끝났습니다!");
		} else if (editType.equals("2")) {
			System.out.println("수정하려는 연락처를 입력하세요");
			pArr[thatNum].setPhone(scan.next());
			System.out.println("수정이 끝났습니다!");
		} else {
			System.out.println("수정하려는 사람의 데이터가 없습니다! ");
		}
	}

	public void delete() {

		search();
		System.out.println(thatNum);
		System.out.println("삭제하려는 데이터의 인덱스번호를 입력하세요");
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
		System.out.println("삭제가 완료 되었습니다.");
	}

	public int menu() {
		int no = 0;
		System.out.println("1.입력  2.출력  3.검색 4.수정 5.삭제 6.종료");
		System.out.println("선택 : ");
		no = scan.nextInt();
		return no;
	}

	public static void main(String[] args) {
		new Ch04Ex06();

	}

}
