package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("Hello, World!");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, Document.OutputSettings.create());
        assertEquals("Hello, World!", accum.toString());
    }

}