package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Hello");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, new Document("").outputSettings());
        assertEquals("Hello", sb.toString());
    }

}