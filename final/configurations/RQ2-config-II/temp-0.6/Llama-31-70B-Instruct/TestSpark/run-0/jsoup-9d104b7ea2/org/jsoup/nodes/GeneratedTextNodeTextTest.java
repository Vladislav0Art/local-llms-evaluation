package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTextNodeTextTest {

    @Test
    public void TextNodeTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

}