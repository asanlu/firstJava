package helloworld;

import javax.swing.JOptionPane;

public class DataType {
	public static void main(String args[]) {
		int year;
		boolean isLeapYear;
		String sYear = JOptionPane.showInputDialog("enter the year:");
		year = Integer.parseInt(sYear);
		isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		if(isLeapYear) {
			sYear = year + "is leap year";
		}else {
			sYear = year + "is not a leap year";
		}
		JOptionPane.showMessageDialog(null, sYear, "½á¹û", JOptionPane.PLAIN_MESSAGE);
		
	}
	
	public void drawFlower(int areaNum[]) {
		for(int num: areaNum) {
//			if num % 10 == 
			System.out.println(num);
		}
	}
}
