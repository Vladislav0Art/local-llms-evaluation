package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetWholeText_4 {

    @Test
    public void testGetWholeText_4() {
        TextNode node = new TextNode("<p>Hello <span>World!</span></p>");
        assertEquals("Hello <span>World!</span>", node.getText());
    }

}