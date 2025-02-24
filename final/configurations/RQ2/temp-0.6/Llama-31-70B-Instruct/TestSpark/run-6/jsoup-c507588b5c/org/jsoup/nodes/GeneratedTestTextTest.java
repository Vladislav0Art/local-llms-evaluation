package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestTextTest {

    @Test
    public void testTextTest() {
        String text = "TextNode text test";
        TextNode textNode = new TextNode("");
        assertEquals(textNode, textNode.text(text));
        assertEquals(text, textNode.text());
    }

}