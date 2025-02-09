package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode node = new TextNode("abc");
        assertEquals("abc", node.text());
    }

}