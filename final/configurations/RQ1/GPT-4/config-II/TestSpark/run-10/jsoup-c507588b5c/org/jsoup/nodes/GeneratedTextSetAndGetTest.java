package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextSetAndGetTest {

    @Test
    public void textSetAndGetTest() {
        TextNode textNode = new TextNode("");
        textNode.text("text");
        assertEquals("text", textNode.text());
    }

}