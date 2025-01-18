package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextGetSetTest {

    @Test
    public void textGetSetTest() {
        TextNode textNode = new TextNode("Sample text");
        assertEquals("Sample text", textNode.text());

        textNode.text("Changed text");
        assertEquals("Changed text", textNode.text());
    }

}