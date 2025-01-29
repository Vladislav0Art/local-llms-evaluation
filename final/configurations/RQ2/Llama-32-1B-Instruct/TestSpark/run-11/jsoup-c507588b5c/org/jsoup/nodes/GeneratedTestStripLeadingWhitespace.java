package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedTestStripLeadingWhitespace {

    public static void main(String[] args) {
        new TextNodeTest().run();
    }

    @Test
    public void testStripLeadingWhitespace() {
        Document document = new Document();
        Element element = document.createElement("text");
        element.setText("");

        TextNode textNode = new TextNode(document, element);
        assertEquals("", TextNode.stripLeadingWhitespace(element.getText()));
    }

}