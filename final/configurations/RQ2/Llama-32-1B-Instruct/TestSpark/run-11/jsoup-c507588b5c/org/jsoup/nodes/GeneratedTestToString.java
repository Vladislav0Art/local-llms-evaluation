package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedTestToString {

    public static void main(String[] args) {
        new TextNodeTest().run();
    }

    @Test
    public void testToString() {
        Document document = new Document();
        Element element = document.createElement("text");

        TextNode textNode = new TextNode(document, element);

        assertEquals("", textNode.toString());
    }

}