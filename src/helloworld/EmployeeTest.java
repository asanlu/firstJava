package helloworld;

import javax.swing.JOptionPane;

public class EmployeeTest {
	public static void main(String args[]) {
		String output = "Employee before instantiation:"+ Employee.getCount();
		Employee e1 = new Employee("Susan", "Baker");
		Employee e2 = new Employee("Bob", "Jones");
		
		output += "\n\nEmployees after instantiation:" + "\nvia e1.getCount():"+ e1.getCount() + 
				"\nvia e2.getCount():" + e2.getCount() + "\nvia Employee.getCount():" + Employee.getCount();
		
		output += "\n\nEmployes 1:"+ e1.getFirstName() + " " + e1.getLastName() + "\nEmployee 2:" +
				e2.getFirstName() + "" + e2.getLastName();
		
		e1 = null;
		e2 = null;
		
		System.gc();  // 显示的运行垃圾收集程序
		output += "\n\nEmployee after System.gc():" + Employee.getCount();
		JOptionPane.showMessageDialog(null, output, "静态方法和域", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
