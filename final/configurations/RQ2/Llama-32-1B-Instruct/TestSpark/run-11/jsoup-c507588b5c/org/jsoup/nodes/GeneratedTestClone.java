package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedTestClone {

    public static void main(String[] args) {
        new TextNodeTest().run();
    }

    @Test
    public void testClone() {
        Document document = new Document();
        Element element = document.createElement("text");
        element.setText("test");

        TextNode textNode = new TextNode(document, element);

        try {
            TextNode clone = textNode.clone();
        } catch (Exception e) {
            fail("Failed to throw exception when calling clone() method");
        }
    }

}