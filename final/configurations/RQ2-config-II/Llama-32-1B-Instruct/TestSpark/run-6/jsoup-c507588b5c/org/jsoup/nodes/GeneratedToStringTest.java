package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals("text", node.toString());
    }

}