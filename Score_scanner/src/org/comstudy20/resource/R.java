package org.comstudy20.resource;
import java.util.Scanner;

import org.comstudy20.model.Dao;
import org.comstudy20.view.Delete;
import org.comstudy20.view.Input;
import org.comstudy20.view.Menu;
import org.comstudy20.view.Modify;
import org.comstudy20.view.Output;
import org.comstudy20.view.View;

public interface R extends View {
	Scanner scan= new Scanner(System.in);
	String appTitle = "SCORE CALCULATOR";
	String menuTitle= "::MENU SERVICE::";
	String inputTitle = "::INPUT SERVICE::";
	String outputTitle = "::OUTPUT SERVICE::";
	String modifyTitle = "::MODIFY SERVICE::";
	String deleteTitle = "::DELETE SERVICE::";
	
	Data data= new Data();
	
	String[] menuArr= {"","���� �Է�", "���� ���", "������ ���� ","������ ����","�ý��� ����"};
	
	View [] viewArr = {new Menu(), new Input(), new Output(), new Modify(), new Delete()};
	
	Dao dao= Dao.getInstance();
}
