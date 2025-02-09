package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestOuterHtmlTail {

    public static Document getDocument() {
        return new Document();
    }

    @Test
    public void testOuterHtmlTail() {
        Node newNode = new Node("");
        Document outputSettings = getDocument();
        String accum = "Hello World";
        String expectedOutput = "<html><body>Hello World</body></html>";
        String actualOutput = newNode.outerHtmlTail(accum, 0, outputSettings).toString();
        assertEquals(expectedOutput, actualOutput);
    }

}