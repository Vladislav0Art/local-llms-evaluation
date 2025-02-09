package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        TextNode node = new TextNode("outer text");
        assertEquals("outer text", node.toString());
    }

}