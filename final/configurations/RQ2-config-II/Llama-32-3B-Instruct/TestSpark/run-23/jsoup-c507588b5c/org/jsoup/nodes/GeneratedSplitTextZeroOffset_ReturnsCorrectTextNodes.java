package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSplitTextZeroOffset_ReturnsCorrectTextNodes {

    @Test
    public void splitTextZeroOffset_ReturnsCorrectTextNodes() {
        String text = "Hello World";
        Document doc = new Document();
        TextNode node = doc.newTextNode(text);
        TextNode[] result = node.splitText(0);
        assertEquals(1, result.length);
        assertTrue(result[0].text().equals(text));
    }

}