package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode node = new TextNode("content");
        node.text("new content");
        assertEquals("new content", node.text());
    }

}