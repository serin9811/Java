package org.comstudy20.view;
import static org.comstudy20.resource.R.*;
public class Menu implements View {

	@Override
	public void display() {
		System.out.println(menuTitle);
		
		for(int i =1 ; i <menuArr.length ; i ++){
			System.out.printf("%d.%s  ", i, menuArr[i]);
		}
		System.out.println();
		System.out.println("Choose the menu>>");
		int no = scan.nextInt();
		data.no = no;
	}

}
