package testtwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class BookTest {
	public static void main(String[] args) {
		Map map = new HashMap();
		Map map2 = new TreeMap();
		//此处，若book里面的构造方法是空的话，最后输出迭代器next的时候是null
		Book b1 = new Book("NB001","西游记",88.6,"四大名著");
		Book b2 = new Book("NB003","红楼梦",88.2,"四大名著");
		Book b3 = new Book("NB002","水浒传",88.2,"四大名著");
		Book b4 = new Book("NB004","三国演义",88.2,"四大名著");
		map.put(0, b1);
		map.put(1, b2);
		map.put(2, b3);
		map.put(3, b4);
		map2.put(0, b1);
		map2.put(1, b2);
		map2.put(2, b3);
		map2.put(3, b4);
		Iterator iterator = map.entrySet().iterator();
		Iterator iterator2 = map.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
			
		}
	}
}
