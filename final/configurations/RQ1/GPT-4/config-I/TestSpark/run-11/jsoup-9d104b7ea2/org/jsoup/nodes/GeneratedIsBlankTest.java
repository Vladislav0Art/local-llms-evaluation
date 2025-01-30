package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode nodeEmpty = new TextNode("");
        TextNode nodeWhiteSpace = new TextNode(" ");
        TextNode nodeText = new TextNode("test");

        assertTrue(nodeEmpty.isBlank());
        assertTrue(nodeWhiteSpace.isBlank());
        assertFalse(nodeText.isBlank());
    }

}