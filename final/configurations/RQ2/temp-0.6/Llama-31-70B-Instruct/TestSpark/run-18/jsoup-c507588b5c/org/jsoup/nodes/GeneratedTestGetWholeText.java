package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("hello world");
        String wholeText = textNode.getWholeText();
        assertEquals("hello world", wholeText);
    }

}