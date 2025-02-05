package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        assertTrue(new TextNode("     ").isBlank());
        assertFalse(new TextNode("  a  ").isBlank());
    }

}