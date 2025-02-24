package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void TextNodeConstructorTest() {
        String text = "test";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

}