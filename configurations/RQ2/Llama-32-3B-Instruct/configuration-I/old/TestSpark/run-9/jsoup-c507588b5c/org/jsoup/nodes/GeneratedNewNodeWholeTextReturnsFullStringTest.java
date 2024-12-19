package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

public class GeneratedNewNodeWholeTextReturnsFullStringTest {

    @Test
    public void newNodeWholeTextReturnsFullStringTest() {
        TextNode textNode = new TextNode("Hello\nWorld");
        assertEquals("Hello\nWorld", textNode.getWholeText());
    }

}