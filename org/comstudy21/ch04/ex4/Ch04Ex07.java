package org.comstudy21.ch04.ex4;

class Test{
	public void printArr(int[] arr){
		for (int i =0; i< arr.length; i++){
			System.out.print(arr[i]+ "\t");
		}
	}

	public void printArr(int[][] arr){
		for (int i =0; i<arr.length; i++){
			for (int j =0; j <arr[i].length; j++){
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}
	}
	public int[] joinArr(int[] arr, int[] arr2){
		int[] arr3 = new int[arr.length+ arr2.length];
		for (int i = 0 ; i < arr.length; i++){
			arr3[i]= arr[i];
		}
		for (int i = 0; i < arr2.length; i ++){
			arr3[i+arr.length]=arr2[i] ;
		}
		return arr3;
		
	}
	public int[][] mkArr(int[] arr, int[] arr2){
		int[][] arr4 = new int [2][];
		arr4[0]= arr;
		arr4[1]= arr2;
		for(int i = 0; i < arr.length; i++){
			arr4[0][i]= arr[i];
			}
		for (int k =0; k <arr2.length; k++){
			arr4[1][k]= arr2[k];
		}
		return arr4;
	}
}
public class Ch04Ex07 {
		public static void main(String[] args){
			int [] arr= {10,20,30,40,50};
			int [] arr2= {140,150,160};
			Test test = new Test();
//			test.printArr(arr);
//			test.printArr(arr2);
		
		//	int[] arr3 = test.joinArr(arr, arr2);
			//test.printArr(arr3);
			System.out.println();
			System.out.println();
			int[][] arr4 = test.mkArr(arr, arr2);
			test.printArr(arr4);
		}

}
