package test;

public class StudentGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade[][] = new int[20][5];
		for (int i = 0; i < 20; i++) {
			grade[i][0] = i+1;
		}
		for (int i = 0; i <20; i++) {
			for (int j = 0; j < 5; j++) {
				grade[i][j]=(int)Math.round(Math.random() * 100);
			}
		}
		for (int i = 0; i <20; i++) {
			System.out.print(i+1+"号学员的成绩是：");
			for (int j = 0; j < 5; j++) {
				System.out.print(grade[i][j]+",");
			}
			System.out.println("");
		}
		int SumGrade[] = new int[20];
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 5; j++) {
				SumGrade[i] +=grade[i][j];
			}
			System.out.println(i+1+"号学员的总成绩是："+SumGrade[i]);
		}
		int avg=0;
		double sum=0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 20; j++) {
				sum+=grade[j][i];
			}
			System.out.println("第"+(i+1)+"门课程的平均分是："+sum/20);
		}
	}
}
