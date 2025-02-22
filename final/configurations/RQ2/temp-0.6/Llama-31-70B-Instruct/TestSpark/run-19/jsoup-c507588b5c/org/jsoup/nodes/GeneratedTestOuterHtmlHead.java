package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlHead {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Some text");
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("Some text", accum.toString());
    }

}