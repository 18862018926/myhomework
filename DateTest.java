package test;

import java.util.Scanner;

public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int i=1;
		while (i<=40) {
			int myyear,mymouth,myday;
			System.out.println("请输入年份：");
			Scanner scan = new Scanner(System.in);
			myyear=scan.nextInt();
			System.out.println("请输入月份：");
			mymouth=scan.nextInt();
			System.out.println("请输入日子：");
			myday=scan.nextInt();
			date.nextDay(myyear, mymouth, myday);
			i++;
		}
	}
}
