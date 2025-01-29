package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GeneratedTestHtml {

    public static void main(String[] args) throws IOException {
        TestSparkRunner.testRun();
    }

    @Test
    public void testHtml() throws IOException {
        Document document = new Document();
        Elements elements = document.select("body");
        for (int i = 0; i < elements.size(); i++) {
            Element element = (Element) elements.get(i);
            System.out.println(element.attr("src"));
        }
    }

}