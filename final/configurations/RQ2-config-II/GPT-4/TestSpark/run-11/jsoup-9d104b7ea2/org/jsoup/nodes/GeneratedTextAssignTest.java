package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextAssignTest {

    @Test
    public void textAssignTest() {
        TextNode node = new TextNode("test");
        node.text("new text");
        assertEquals("new text", node.text());
    }

}