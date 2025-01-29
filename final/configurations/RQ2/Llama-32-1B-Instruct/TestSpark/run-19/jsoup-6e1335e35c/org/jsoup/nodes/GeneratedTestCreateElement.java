package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestCreateElement {

    public static String parseHtml(String html) {
        Document doc = Jsoup.parse(html);
        return doc.html();
    }

    public static Tag parseElement(String tagName, String attrs, String text) {
        Element elem = new Element(tagName, attrs);
        if (text != null && !text.isEmpty()) {
            elem.text(text);
        }
        return elem;
    }

    @Test
    public void testCreateElement() {
        Document doc = Jsoup.parse("<html><body><span>Hello World!</span></body></html>");
        String text1 = doc.text();
        Tag tag1 = parseElement("span", "", "First span");
        System.out.println(tag1.html());
    }

}