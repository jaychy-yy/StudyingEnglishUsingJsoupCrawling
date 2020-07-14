package project.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SelectTest {
	public static void main(String[] args) throws IOException {
		String url = "https://docs.oracle.com/javase/8/docs/api/";
		Document doc = Jsoup.connect(url).get();
		
		System.out.println("HTML : " + doc.title());
		
		Elements elements = doc.select("frameset");
		System.out.println(elements.html());
		System.out.println("\n¶ç¿ö¾²±â\n");
		
		Elements elements2 = doc.select("frameset").select("frame");
		System.out.println(elements2.toString());
		System.out.println("\n¶ç¿ö¾²±â\n");
		
		Elements elements3 = doc.select("frameset").select("frame");
		for(Element e : elements3) {
			System.out.println(e.data());
			System.out.println(e.baseUri());
		}
	}
}