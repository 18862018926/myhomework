package testtwo;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyFrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 1. 生成0-100之间的200个随机整数，并统计各个数出现的次数和频率(用XX.X%表示)。 0==〉10次==〉XX.X%
		 * 1==〉20次==〉XX.X% 。。。。。。 用HashMap实现。
		 */
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < 200; i++) {
			int num = (int) (Math.random()*101);
			if (map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}else {
				map.put(num,1);
			}
		}
		//定义一个百分比类型的数nf
		NumberFormat nf = NumberFormat.getPercentInstance();
		//定义精确到小数点后面1位
		nf.setMinimumFractionDigits(1);
		for (Integer it : map.keySet()) {
			double f = (double)map.get(it)/200;
			System.out.println(it+"出现了"+map.get(it)+"次,频率是："+nf.format(f));
		}
	}

}
