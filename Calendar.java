package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		System.out.println("请输入月份：");
		int mouth = scan.nextInt();
		//根据年份和月份计算这个月有多少天 
		int daOfMouth = 31;
		switch (mouth) {
		case 2:
			if (year%400==0||(year%4==0&&year%100!=0)) {
				daOfMouth = 29;
			}else {
				daOfMouth = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			daOfMouth = 30;
			break;
		}
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		//计算每个月的一号是星期几
		Date date = new Date(year-1900,mouth-1,1);
		//得到一号是周几
		int weekDay = date.getDay();
		int printCount = 0;
		//打印出周几前面的空格
		while (printCount<weekDay) {
			System.out.print("\t");
			printCount++;
		}
		//打印出具体的某一天并且放在相应的位置
		int printDay = 1;
		while (printDay<daOfMouth) {
			System.out.print(printDay+"\t");
			printDay++;
			printCount++;
			if (printCount%7==0) {
				System.out.print("\n");
			}
		}
	}

}
