package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTextNodeTextTest {

    @Test
    public void textNodeTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
        textNode.text("new test");
        assertEquals("new test", textNode.text());
    }

}