package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedOuterHtmlHeadRenderingTest {

    @Test
    public void outerHtmlHeadRenderingTest() {
        StringBuilder builder = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings(true);
        TextNode node = new TextNode("   ");
        node.outerHtmlHead(builder, depth, out);
        assertEquals("<p>\n", builder.toString());
    }

}