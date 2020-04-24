package fileandflow;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

import sun.management.FileSystem;

public class WriteSth {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File f = new File("d:/test.txt");
		f.createNewFile();
		Writer wt = new FileWriter(f);
		wt.write("Java是一门面向对象编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念...");
		wt.flush();
		wt.close();

		char []a = new char[1024];
		FileReader fr = new FileReader(f);
		fr.read(a);
		System.out.println(a);
		fr.close();
		
		File f1 = new File("d:/test1.txt");
		f1.createNewFile();
		Writer wt1 = new FileWriter(f1);
		wt1.write(a);
		wt1.flush();
		wt1.close();
		
	}

}
