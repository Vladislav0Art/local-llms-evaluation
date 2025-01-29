package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextNodeOuterHtmlHead {

    @Test
    public void testTextNodeOuterHtmlHead() throws IOException {
        String text = "";
        TestTextNodeNode node = new TextNodeNode(text, "");
        assertEquals("", node.outerHtmlHead(null, 0, null).trim());
    }

}