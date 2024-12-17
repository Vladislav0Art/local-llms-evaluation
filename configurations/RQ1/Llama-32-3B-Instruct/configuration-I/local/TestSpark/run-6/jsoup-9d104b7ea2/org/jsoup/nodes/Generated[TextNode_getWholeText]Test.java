package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNode_getWholeText]

Test {

    @Test
    public void [TextNode_getWholeText]Test() throws IOException {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        String wholeText = textNode.getWholeText();
        assertNotNull(wholeText);
        assertEquals("Hello, World!", wholeText);
    }

}