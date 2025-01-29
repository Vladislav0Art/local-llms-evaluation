package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestCreateElementWithEmptyString {

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
    public void testCreateElementWithEmptyString() {
        Document doc = Jsoup.parse("<html><body><span>Hello World!</span></body></html>");
        Tag tag = parseElement("", "", "");
        System.out.println(tag.html());
    }
}

class Tag extends Element {
    public String text;
    public Object attrs;

    @Override
    public String toString() {
        return "Tag{" +
                "text='" + text + '\'' +
                ", attrs=" + attrs +
                '}';
    }

}