package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetWholeText_ReturnsCorrectString {

    @Test
    public void getWholeText_ReturnsCorrectString() {
        String text = "Hello World";
        Document doc = new Document();
        TextNode node = doc.newTextNode(text);
        assertEquals(text, node.getWholeText());
    }

}