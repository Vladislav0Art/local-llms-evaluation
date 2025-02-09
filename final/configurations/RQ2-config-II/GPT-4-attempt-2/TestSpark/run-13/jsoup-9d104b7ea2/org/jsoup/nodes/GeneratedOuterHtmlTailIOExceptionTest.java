package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailIOExceptionTest {

    @Test
    public void outerHtmlTailIOExceptionTest() throws IOException {
        StringBuilder accum = new StringBuilder();
        TextNode textNode = new TextNode("Test");
        textNode.outerHtmlTail(accum, 0, new Document.OutputSettings());
    }

}