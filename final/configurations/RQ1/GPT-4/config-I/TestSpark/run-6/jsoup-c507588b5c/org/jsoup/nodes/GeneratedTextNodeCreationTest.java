package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTextNodeCreationTest {

    @Test
    public void textNodeCreationTest() {
        TextNode node = new TextNode("Some text");
        assertEquals("Some text", node.getWholeText());
    }

}