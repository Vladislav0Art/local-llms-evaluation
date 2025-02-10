package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetWholeText_WrapInQuotes {

    @Test
    public void testGetWholeText_WrapInQuotes() {
        TextNode node = new TextNode("\"Hello, World!\"");
        String expected = "\"Hello, World!\"
        ";
        String actual = node.getText();
        assertEquals(expected, actual);
    }

}