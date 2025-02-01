package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTextChainTest {

    @Test
    public void textChainTest() {
        TextNode node = new TextNode("Test");
        TextNode chainNode = node.text("New Test");
        assertEquals("New Test", chainNode.text());
    }

}