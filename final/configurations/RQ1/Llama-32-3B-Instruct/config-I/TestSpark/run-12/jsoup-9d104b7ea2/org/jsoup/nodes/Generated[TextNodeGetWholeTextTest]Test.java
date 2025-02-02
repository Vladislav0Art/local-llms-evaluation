package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNodeGetWholeTextTest]

Test {

    @Test
    public void [TextNodeGetWholeTextTest]Test() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        String wholeText = node.getWholeText();
        assertNotNull(wholeText);
        assertEquals(text, wholeText);
    }

}