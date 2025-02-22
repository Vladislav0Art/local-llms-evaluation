package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        TextNode node = new TextNode("text");
        StringBuilder sb = new StringBuilder();
        node.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("text", sb.toString());
    }

}