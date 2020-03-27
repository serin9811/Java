package org.comstudy21.ch04.ex02;


class Point {
	//private�� ��ü ���ο����� ���� ����
	private int x;
	private int y;
	//setters
	//this�� ��ü �ڽ��� ����Ű�� ��������
	public void setX(int _x){
		this.x = _x;
	}
	public void setY(int _y){
		this.y = _y;
	}
	//ĸ��ȭ�� ���� ����ʵ�� private���� ����. 
	//�׸��� ����޼ҵ�� public���� ����.
	//getters
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
public class Ch04Ex02 {

	public static void main(String[] args) {
			Point pt = new Point();
//			pt.x = 100;
//			pt.y =200;
//			
			pt.setX(100);
			pt.setX(200);
			System.out.println(pt);

	}

}
