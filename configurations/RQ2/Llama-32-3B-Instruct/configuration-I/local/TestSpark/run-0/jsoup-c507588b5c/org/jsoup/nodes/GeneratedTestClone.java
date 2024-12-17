package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestClone {

    @Test
    public void testClone() throws Exception {
        String html = "<html><body>This is a <span>test</span> text.</body></html>";
        Document soup = Jsoup.parse(html);
        TextNode clone = new TextNode(soup.body().text());
        assertNotEquals(clone, clone.clone());
    }
}

class TextNode {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

    public ListElement>

    getElements() {
        ListElement > elements = new ArrayList > ();
        while (text != null && !text.isEmpty()) {
            int index = text.indexOf(" ");
            if (index == -1) {
                break;
            }
            elements.add(new Element(text.substring(0, index)));
            text = text.substring(index + 1);
        }
        return elements;
    }

    public TextNode clone() {
        return new TextNode(getText());
    }
}

class Element {

    private String text;

    public Element(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Element)) {
            return false;
        }
        Element element = (Element) o;
        return text.equals(element.text);
    }

    @Override
    public int hashCode() {
        return text.hashCode();
    }

}