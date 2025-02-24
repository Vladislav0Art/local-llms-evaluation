package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestGetWholeTextTest {

    @Test
    public void testGetWholeTextTest() {
        String text = "GetWholeText test";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}