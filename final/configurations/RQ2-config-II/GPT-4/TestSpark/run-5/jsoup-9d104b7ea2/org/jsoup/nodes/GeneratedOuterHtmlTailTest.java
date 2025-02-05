package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("test");
        StringBuilder stringBuilder = new StringBuilder();
        textNode.outerHtmlTail(stringBuilder, 0, new Document.OutputSettings());

        assertEquals("", stringBuilder.toString());
    }

}