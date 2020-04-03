package org.comstudy20.model;

public class Dao {
	private final static int MAX =100;
	private Dto[] dtoPplArr = new Dto[MAX];
	private int top=0;
	private int seq=0;
	
	private Dao(){}
	private static Dao instance;
	public static Dao getInstance(){
		if(instance ==null){
			instance = new Dao();
		}
		return instance;
	}
	
	public void insert(Dto dto){
		dto.setIdx(top++);
		dtoPplArr[seq++]= dto;
		System.out.println("Input success");
	}
	
	public boolean emptyChecker(){
		if(top ==0){
			System.out.println("No data to print out");
			return false;
		}
		else {
			return true;
		}
	}
	
	public Dto[] selectAll(){
		
		Dto[] newArr = new Dto[top];
		for(int i =0; i < top ; i++){
			newArr[i] = new Dto();
			newArr[i].setIdx(dtoPplArr[i].getIdx());
			newArr[i].setName(dtoPplArr[i].getName());
			newArr[i].setKorean(dtoPplArr[i].getKorean());
			newArr[i].setEnglish(dtoPplArr[i].getMath());
			newArr[i].setMath(dtoPplArr[i].getMath());
			newArr[i].setSum(dtoPplArr[i].getKorean(), dtoPplArr[i].getMath(), dtoPplArr[i].getMath());
			newArr[i].setAverage(dtoPplArr[i].getKorean(), dtoPplArr[i].getMath(), dtoPplArr[i].getMath());
		
		}
		return newArr;
	}
	

}
