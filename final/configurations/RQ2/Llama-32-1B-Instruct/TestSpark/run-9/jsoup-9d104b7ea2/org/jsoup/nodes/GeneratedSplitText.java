package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.TextNodeVisitor;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GeneratedSplitText {

    public static void main(String[] args) {
        TextNodeTest test = new TextNodeTest();
        test.testText();
        test.testIsBlank();
        test.testSplitText();
        test.testToString();
        test.testClone();
        test.testOuterHtmlHead();
        test.testOuterHtmlTail();
        test.testnodeName();
    }

    @Test
    public void splitText() {
        TextNode node1 = new TextNode("Hello, World! ");
        List<String> result = (List<String>) node1.splitText(7);
        assertEquals(List.of("Hello, World!"), result);
    }

}