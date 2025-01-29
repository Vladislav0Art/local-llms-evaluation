package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestParseHtml {

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
    public void testParseHtml() {
        String html = "<p>This is a paragraph of text.</p>";
        System.out.println(parseHtml(html));
    }

}