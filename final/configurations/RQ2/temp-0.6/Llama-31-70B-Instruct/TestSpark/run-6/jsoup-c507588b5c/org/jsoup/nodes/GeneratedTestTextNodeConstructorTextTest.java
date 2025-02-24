package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestTextNodeConstructorTextTest {

    @Test
    public void testTextNodeConstructorTextTest() {
        String text = "This is a test";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

}