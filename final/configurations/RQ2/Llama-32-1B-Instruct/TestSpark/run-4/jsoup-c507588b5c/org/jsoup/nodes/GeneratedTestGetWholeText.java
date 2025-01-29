package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("test");
        String text = "test";
        assertNotNull(node.getWholeText());
        assertEquals(text, node.getWholeText());
        assertNull(node.getWholeText(null));
    }

}