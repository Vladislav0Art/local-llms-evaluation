package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String initialText = "Hello World";
        TextNode node = new TextNode(initialText);
        TextNode newNode = node.splitText(5);
        assertEquals("Hello", node.getWholeText());
        assertEquals(" World", newNode.getWholeText());
    }

}