package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("test");
        String wholeText = textNode.getWholeText();
        assertEquals("test", wholeText);
    }

}