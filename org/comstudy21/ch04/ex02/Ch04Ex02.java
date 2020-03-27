package org.comstudy21.ch04.ex02;


class Point {
	//private은 객체 내부에서만 접근 가능
	private int x;
	private int y;
	//setters
	//this는 객체 자신을 가르키는 참조변수
	public void setX(int _x){
		this.x = _x;
	}
	public void setY(int _y){
		this.y = _y;
	}
	//캡슐화를 위해 멤버필드는 private으로 선언. 
	//그리고 멤버메소드는 public으로 선언.
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
