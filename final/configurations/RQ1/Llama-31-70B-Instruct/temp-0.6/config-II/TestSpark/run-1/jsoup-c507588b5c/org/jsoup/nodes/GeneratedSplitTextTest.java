package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode newTextNode = textNode.splitText(2);
        assertEquals("te", textNode.text());
        assertEquals("st", newTextNode.text());
    }

}