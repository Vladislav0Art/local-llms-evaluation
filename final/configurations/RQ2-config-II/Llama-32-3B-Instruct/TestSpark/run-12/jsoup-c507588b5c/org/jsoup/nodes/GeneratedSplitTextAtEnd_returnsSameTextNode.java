package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitTextAtEnd_returnsSameTextNode {

    @Test
    public void splitTextAtEnd_returnsSameTextNode() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        int offset = 11;
        TextNode newText = textNode.splitText(offset);
        assertEquals(originalText, newText.text());
    }

}