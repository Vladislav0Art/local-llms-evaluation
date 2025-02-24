package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestTextNodeConstructorNullTest {

    @Test
    public void testTextNodeConstructorNullTest() {
        String text = null;
        TextNode textNode = new TextNode(text);
        assertEquals("", textNode.text());
    }

}