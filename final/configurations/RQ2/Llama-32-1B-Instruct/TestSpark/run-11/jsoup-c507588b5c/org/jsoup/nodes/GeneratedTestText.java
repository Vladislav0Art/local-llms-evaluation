package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedTestText {

    public static void main(String[] args) {
        new TextNodeTest().run();
    }

    @Test
    public void testText() {
        Document document = new Document();
        Element element = document.createElement("text");
        element.setText("test");
        element.append(new TextNode(document, element));

        TextNode textNode = new TextNode(document, element);
        assertEquals("test", textNode.text());
    }

}