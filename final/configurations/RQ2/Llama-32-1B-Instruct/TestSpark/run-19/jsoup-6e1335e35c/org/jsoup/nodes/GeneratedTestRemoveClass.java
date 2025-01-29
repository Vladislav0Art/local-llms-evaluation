package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestRemoveClass {

    public static String parseHtml(String html) {
        Document doc = Jsoup.parse(html);
        return doc.html();
    }

    public static Element createElement(String tagName, String attrs, String text) {
        Element elem = new Element(tagName, attrs);
        if (text != null) {
            elem.text(text);
        }
        return elem;
    }

    @Test
    public void testRemoveClass() {
        Document doc = Jsoup.parse("<span class='TestClass'>This is a span with class 'TestClass'.</span>");
        Element elem1 = createElement("span", "", "TestClass");
        String text1 = parseHtml(doc.html()).replaceAll("\\.TestClass2", "");
        System.out.println(createElement("span", "", text1));
    }

}