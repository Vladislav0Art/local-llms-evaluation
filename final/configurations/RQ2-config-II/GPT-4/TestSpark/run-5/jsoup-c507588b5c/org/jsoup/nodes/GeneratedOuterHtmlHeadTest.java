package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("test");
        StringBuilder builder = new StringBuilder();
        textNode.outerHtmlHead(builder, 0, new Document.OutputSettings());
        assertEquals("test", builder.toString());
    }

}