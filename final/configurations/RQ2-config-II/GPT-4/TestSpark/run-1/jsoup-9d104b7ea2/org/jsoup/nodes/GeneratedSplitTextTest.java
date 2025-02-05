package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "text to split";
        TextNode textNode = new TextNode(text);

        textNode.splitText(4);
        assertEquals("text", textNode.getWholeText());
    }

}