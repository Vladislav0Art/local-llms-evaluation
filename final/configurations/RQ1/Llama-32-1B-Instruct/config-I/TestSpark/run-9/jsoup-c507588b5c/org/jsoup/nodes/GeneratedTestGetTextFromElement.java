package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestGetTextFromElement {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Test
    public void testGetTextFromElement() {
        Document doc = TextNode.getDocument();
        Element textNode = doc.createElement("text");
        textNode.appendChild(doc.createTextNode(""));
        TextNode textNode2 = new TextNode(textNode);
        assertEquals("", textNode2.getText());
    }
}

public class TestSparkDriver {
    public static void main(String[] args) {
        org.jsoup.nodes.Document document = org.jsoup.nodes.Document.create();
        TextNode textNode = new TextNode("Hello");
        System.out.println(TextNode.isBlank());
    }

}