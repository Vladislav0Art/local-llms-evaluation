package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedOuterHtmlTailRenderingTest {

    @Test
    public void outerHtmlTailRenderingTest() {
        StringBuilder builder = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings(true);
        TextNode node = new TextNode("   ");
        node.outerHtmlTail(builder, depth, out);
        assertEquals("", builder.toString());
    }

}