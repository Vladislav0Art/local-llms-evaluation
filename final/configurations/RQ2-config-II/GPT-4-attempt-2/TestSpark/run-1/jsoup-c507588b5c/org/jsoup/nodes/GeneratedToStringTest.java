package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void ToStringTest() {
        TextNode textNode = new TextNode("to string text");
        assertEquals("to string text", textNode.toString());
    }

}