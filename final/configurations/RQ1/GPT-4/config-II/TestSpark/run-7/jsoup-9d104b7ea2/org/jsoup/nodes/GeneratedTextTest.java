package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode node = new TextNode(" Test ");
        assertEquals("Test", node.text());
    }

}