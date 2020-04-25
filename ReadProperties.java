package fileandflow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class ReadProperties {
	public static void main(String[] args) throws IOException  {
		File file = new File("f:/asd.asd");
		file.createNewFile();
		/**
		 * OutputStream实现写
		 */
		OutputStream op = new FileOutputStream(file);
		op.write("asdasd2222222222222撒大苏打S".getBytes());
		op.flush();
		op.close();
		/**
		 * InputStream实现“读”
		 */
		InputStream ip = new FileInputStream(file);
		byte[] b = new byte[1024];
		ip.read(b);
		//byte转String
		String s = new String(b);
		System.out.println(s);
		ip.close();
		/**
		 * writer实现“写”
		 */
		File file2 = new File("F:\\write.txt");
		Writer wt = new FileWriter(file2);
		wt.write("asd123阿斯顿");
		wt.flush();
		wt.close();
		/**
		 * reader实现“读”
		 */
		Reader rd = new FileReader(file2);
		char[] e = new char[128];
		rd.read(e);
		System.out.println("***分割***");
		for (char c : e) {
			System.out.print(c);
		}
	}
}
