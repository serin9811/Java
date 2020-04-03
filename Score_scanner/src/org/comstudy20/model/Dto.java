package org.comstudy20.model;

public class Dto {

	private int idx;
	private String name;
	private double korean;
	private double english;
	private double math;
	private double sum;
	private double average;
	

	public Dto() {
		this(0, "",0.0,0.0,0.0,0.0,0.0);
	}

	public Dto(int idx, String name, double korean, double english, double math, double sum, double average) {
		
		this.idx = idx;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.sum = sum;
		this.average = average;
		
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKorean() {
		return korean;
	}

	public void setKorean(double korean) {
		this.korean = korean;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}
	
	public void setSum(double korean, double english, double math){
		this.sum = getKorean()+ getEnglish()+ getMath();
	}
	
	public void setAverage(double korean, double english, double math){
		this.average= (getKorean()+ getEnglish()+ getMath())/3;
	}
	
	public double getSum(){
		return sum;
	}
	
	public double getAverage(){
		return average;
	}

	@Override
	public String toString() {
		return "Dto [idx=" + idx + ", name=" + name + ", korean=" + korean + ", english=" + english + ", math=" + math
				+ ", sum=" + sum + ", average=" + average + "]";
	}
}
