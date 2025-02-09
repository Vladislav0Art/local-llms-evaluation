package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTextSetTextTest {

    @Test
    public void textSetTextTest() {
        TextNode node = new TextNode("abc");
        node.text("xyz");
        assertEquals("xyz", node.text());
    }

}