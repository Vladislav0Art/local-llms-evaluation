package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        assertEquals("", new TextNode("").getWholeText());
        assertEquals("Hello World!", new TextNode("Hello\nWorld!").getWholeText());
        assertEquals("This is a line of text.", new TextNode("This is a line of \n\ntext.").getWholeText());
    }

}