package helloworld;

import javax.swing.JOptionPane;

public class TimeTest1 {
	public static void main(String args[]) {
		Time1 time1 = new Time1();
		String output = "time1 对象建立后\n时间：" + time1.toString();
		time1.setTime(13, 27, 6);
		output += "\n用setTime方法（13,27,6）修改time1对象后\n时间："+ time1.toString();
		Time1 time2 = new Time1();
		time2.setTime(11, 27, 12);
		output += "time1\n\n time2 \n时间：" + time2.toString();
		time2.setTime(99, 89, 99);
		output += "\n用setTime方法（99,89,99）修改time2对象后\n时间："+ time1.toString();
		JOptionPane.showMessageDialog(null, output, "时间测试： 建立两个时钟对象", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
