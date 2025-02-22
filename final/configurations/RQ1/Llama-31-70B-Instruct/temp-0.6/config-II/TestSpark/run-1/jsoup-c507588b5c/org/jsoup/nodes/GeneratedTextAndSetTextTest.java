package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTextAndSetTextTest {

    @Test
    public void textAndSetTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
        textNode.text(" new test ");
        assertEquals("new test", textNode.text());
    }

}