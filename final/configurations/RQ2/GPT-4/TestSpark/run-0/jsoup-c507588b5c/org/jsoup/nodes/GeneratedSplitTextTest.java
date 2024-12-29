package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String textContent = "test";
        TextNode node = new TextNode(textContent);
        TextNode newNode = node.splitText(2);
        assertEquals("te", node.text());
        assertEquals("st", newNode.text());
    }

}