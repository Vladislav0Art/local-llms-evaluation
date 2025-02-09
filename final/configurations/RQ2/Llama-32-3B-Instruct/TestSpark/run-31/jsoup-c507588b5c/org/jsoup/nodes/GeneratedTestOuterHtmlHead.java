package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestOuterHtmlHead {

    public static Document getDocument() {
        return new Document();
    }

    @Test
    public void testOuterHtmlHead() {
        Node newNode = new Node("");
        Document outputSettings = getDocument();
        String accum = "Hello World";
        String expectedOutput = "<html><head></head><body>Hello World</body></html>";
        String actualOutput = newNode.outerHtmlHead(accum, 0, outputSettings).toString();
        assertEquals(expectedOutput, actualOutput);
    }

}