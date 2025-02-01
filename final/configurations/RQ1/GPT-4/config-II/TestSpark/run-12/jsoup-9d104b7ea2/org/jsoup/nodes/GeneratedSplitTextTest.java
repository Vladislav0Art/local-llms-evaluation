package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode tailNode = textNode.splitText(6);
        assertEquals("Hello,", textNode.getWholeText());
        assertEquals(" World!", tailNode.getWholeText());

        TextNode newTONode = textNode.splitText(2);
        assertEquals("He", newTONode.getWholeText());
    }

}