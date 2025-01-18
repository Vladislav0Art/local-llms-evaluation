package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode nonBlankNode = new TextNode("Sample text");
        assertFalse(nonBlankNode.isBlank());

        TextNode blankNode = new TextNode("    ");
        assertTrue(blankNode.isBlank());
    }

}