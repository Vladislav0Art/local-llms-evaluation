package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Hello, World!");
        assertNotNull(textNode.toString());
        assertEquals("Hello, World!", textNode.toString());
    }

}