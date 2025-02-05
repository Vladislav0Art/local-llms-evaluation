package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("test");
        StringBuilder builder = new StringBuilder();
        textNode.outerHtmlTail(builder, 0, new Document.OutputSettings());
        assertEquals("", builder.toString());
    }

}