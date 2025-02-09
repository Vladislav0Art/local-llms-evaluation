package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTextNodeCreationTest {

    @Test
    public void TextNodeCreationTest() {
        TextNode node = new TextNode("content");
        assertEquals("content", node.text());
    }

}