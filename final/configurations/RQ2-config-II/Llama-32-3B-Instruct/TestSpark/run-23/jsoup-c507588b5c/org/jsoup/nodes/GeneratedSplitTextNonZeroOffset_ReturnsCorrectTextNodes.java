package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSplitTextNonZeroOffset_ReturnsCorrectTextNodes {

    @Test
    public void splitTextNonZeroOffset_ReturnsCorrectTextNodes() {
        String text = "Hello World";
        Document doc = new Document();
        TextNode node = doc.newTextNode(text);
        int offset = 6;
        TextNode[] result = node.splitText(offset);
        assertEquals(2, result.length);
        assertTrue(result[0].text().equals("Hello "));
        assertTrue(result[1].text().equals("World"));
    }

}