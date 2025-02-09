package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "sample text";
        int offset = 6;
        TextNode textNode = new TextNode(text);
        TextNode splittedTextNode = textNode.splitText(offset);
        assertEquals(text.substring(0, offset), textNode.text());
        assertEquals(text.substring(offset), splittedTextNode.text());
    }

}