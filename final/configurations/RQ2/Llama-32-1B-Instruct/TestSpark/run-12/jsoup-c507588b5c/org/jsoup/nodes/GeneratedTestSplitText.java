package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        assertEquals("", new TextNode("").splitText(0));
        assertEquals("Hello World!", new TextNode("Hello\nWorld!").splitText(1));
        assertEquals("", new TextNode("This is a line of text.").splitText(-1));
    }

}