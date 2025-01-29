package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestCreateMultipleElements {

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
    public void testCreateMultipleElements() {
        Document doc = Jsoup.parse("<html><body><p>This is a paragraph of text.</p><br><span>Hello World!</span></body></html>");
        String text2 = doc.text();
        Tag tag2 = parseElement("span", "", "");
        System.out.println(tag2.html());
    }

}