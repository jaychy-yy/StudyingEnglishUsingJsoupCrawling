package project.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Test {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://docs.oracle.com/javase/8/docs/api/\"");
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		StringBuffer sourceCode = new StringBuffer();
		
		String sourceLine = "";
		while((sourceLine=br.readLine()) != null) {
			sourceCode.append(sourceLine+"\n");
		}
		System.out.println(sourceCode.toString());
	}
}