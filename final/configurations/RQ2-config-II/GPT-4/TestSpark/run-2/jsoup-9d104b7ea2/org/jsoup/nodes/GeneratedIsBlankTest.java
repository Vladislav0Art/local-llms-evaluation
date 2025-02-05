package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode blankNode = new TextNode("  ");
        assertTrue(blankNode.isBlank());
        TextNode notBlankNode = new TextNode("notBlank");
        assertFalse(notBlankNode.isBlank());
    }

}