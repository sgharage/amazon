package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(
				"D:\\Sarika\\selenium project\\Amazon_TestAutomation\\Amazon\\src\\test\\resources\\ConfigFiles\\config.properties");
		Properties p = new Properties();
		p.load(fr);
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("url"));

	}
}
