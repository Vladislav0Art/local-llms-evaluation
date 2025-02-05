package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextSetGetTest {

    @Test
    public void textSetGetTest() {
        TextNode textNode = new TextNode("oldText");
        assertEquals("oldText", textNode.text());
        textNode.text("newText");
        assertEquals("newText", textNode.text());
    }

}