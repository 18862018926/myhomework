package testtwo;

import java.text.NumberFormat;
import java.util.HashMap;

public class Frequency {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// 产生200个随机整数并赋值
		for (int i = 0; i < 200; i++) {
			//产生范围在0-100的随机数random
			int random = (int) (Math.random() * 100);
			//检查map的key是否含有此随机数,如果是的话，value+1，如果不是的话value就是1
			if (map.keySet().contains(random)) {
				map.put(random, map.get(random) + 1); // 替换旧值
			} else {
				map.put(random, 1);
			}
		}
		// 获取格式化对象
		//返回指定语言的百分比格式
		NumberFormat nt = NumberFormat.getPercentInstance();
		nt.setMinimumFractionDigits(1); // 小数的最小位
		// 遍历集合 ,求各个值出现的次数和频率
		for (Integer set : map.keySet()) {
			double f = (double) map.get(set) / 200;
			System.out.println(set + "出现了" + map.get(set) + "次,频率是: "
					+ nt.format(f));
		}

	}
}
