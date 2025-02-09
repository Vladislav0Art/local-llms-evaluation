package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode(" ");
        assertTrue(node.isBlank());

        node = new TextNode("xyz");
        assertFalse(node.isBlank());
    }

}