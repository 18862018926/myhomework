package test;

public class Date {
	public static void nextDay(int year,int mouth,int day) {
		System.out.println("计算前的下一天是"+year+"年"+mouth+"月"+day+"日");
		int flag=0;
		int yearchange = 0,mouthchange = 0,daychange = 0;
		// 此处加一个判断月<12,日<31
		if (mouth > 12 || day > 31||day<1) {
			System.out.println("输入错误！");
		} else {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				flag = 1;// flag=1是闰年，flag是0则是平年
			} else {
				flag = 0;
			}
			if (mouth == 2) {
				if (flag == 0) {// 年份是平年
					if (day < 28) {
						daychange=day+1;
						mouthchange=mouth;
						yearchange = year;
					}else if (day == 28){
						daychange = 1;
						mouthchange=mouth+1;// mouth是三月了
						yearchange = year;
					}else{
						System.out.println("平年的二月天数应该不大于28");
					}
				}
				if (flag == 1) {// 年份是闰年
					if (day < 29) {
						daychange=day+1;
						mouthchange=mouth;
						yearchange = year;
					} else if (day == 29){
						daychange = 1;
						mouthchange=mouth+1;// mouth是三月了
						yearchange = year;
					}else{
						System.out.println("平年的二月天数应该不大于29");
					}
				}
			}
			if (mouth == 12) {
				if (day < 31) {
					daychange =day+1;// 如果日小于31则月份年份不变，日加一
					mouthchange=mouth;
					yearchange = year;
				} else {
					daychange = 1;
					mouthchange =1;
					yearchange = year+1;
				}
			}
			if (mouth == 1 || mouth == 3 || mouth == 5 || mouth == 7
					|| mouth == 8 || mouth == 10) {
				if (day < 31) {
					daychange =day+1;// 如果日小于31则月份年份不变，日加一
					mouthchange=mouth;
					yearchange = year;
				} else {
					daychange = 1;
					mouthchange =mouth+1;
					yearchange = year;
				}
			}
			if (mouth == 4 || mouth == 6 || mouth == 9 || mouth == 11) {
				if (day < 30) {
					daychange = day+1;
					mouthchange=mouth;
					yearchange = year;
				} else {
					mouthchange =mouth+1;
					daychange = 1;
					yearchange = year;
				}
			}
		}
		System.out.println("计算后的下一天是"+yearchange+"年"+mouthchange+"月"+daychange+"日");
	}
}
