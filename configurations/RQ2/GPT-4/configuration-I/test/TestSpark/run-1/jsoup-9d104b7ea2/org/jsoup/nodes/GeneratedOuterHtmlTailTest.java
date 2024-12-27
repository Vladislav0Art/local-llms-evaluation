package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("Hello");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlTail(sb, 0, new Document("").outputSettings());
        assertEquals("", sb.toString());
    }

}