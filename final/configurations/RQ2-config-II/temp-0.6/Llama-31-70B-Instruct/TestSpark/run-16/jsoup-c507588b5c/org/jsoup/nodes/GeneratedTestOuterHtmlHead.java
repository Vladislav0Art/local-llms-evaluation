package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        TextNode textNode = new TextNode("test");
        StringBuilder builder = new StringBuilder();
        textNode.outerHtmlHead(builder, 0, null);
        assertEquals("test", builder.toString());
    }

}