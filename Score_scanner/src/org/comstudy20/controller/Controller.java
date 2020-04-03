package org.comstudy20.controller;

import static org.comstudy20.resource.R.*;

public class Controller {
	public static void service() {

		viewArr[data.no].display();

		switch (data.no) {
		case 1:
			viewArr[data.no].display();
			dao.insert(data.dto);
			break;
		case 2:
			if(dao.emptyChecker()){
			data.dtoPplArr = dao.selectAll();
			viewArr[data.no].display();}
			break;
		case 3:
			viewArr[data.no].display();
			break;
		case 4:
			viewArr[data.no].display();
			break;
		case 5:
			System.out.println("Okay Bye!");
			System.exit(0);
			break;
		default:
			System.out.println("Choose again on our menu. ");

		}

		data.no = 0;
		service();
	}
}
