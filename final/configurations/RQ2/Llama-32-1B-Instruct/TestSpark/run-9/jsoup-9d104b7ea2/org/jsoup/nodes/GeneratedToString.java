package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.TextNodeVisitor;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GeneratedToString {

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
    public void toString() {
        Document document = new Document();
        Elements elements = document.getElementsByTag("text");
        for (String element : elements) {
            TextNodeVisitor visitor = new TextNodeVisitor();
            element.accept(visitor);
            assertEquals("Hello, World!", visitor.toString());
        }
    }

}