package org.comstudy20.view;
import static org.comstudy20.resource.R.*;

import org.comstudy20.model.Dto;
public class Input implements View {

	@Override
	public void display() {
		Dto dto = new Dto();
		System.out.println(inputTitle);
		
		System.out.println("Enter name>>");
		dto.setName(scan.next());
		System.out.println("Enter Korean score>>");
		dto.setKorean(scan.nextDouble());
		System.out.println("Enter English score>>");
		dto.setEnglish(scan.nextDouble());
		System.out.println("Enter Math score>>");
		dto.setMath(scan.nextDouble());
		
		dto.setSum(dto.getKorean(), dto.getEnglish(), dto.getMath());
		dto.setAverage(dto.getKorean(), dto.getEnglish(), dto.getMath());
		data.dto= dto;
		
		System.out.println(data.dto);
	}
}
