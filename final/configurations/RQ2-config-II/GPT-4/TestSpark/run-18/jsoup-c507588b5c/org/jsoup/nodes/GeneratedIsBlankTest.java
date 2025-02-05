package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode blankNode = new TextNode("");
        assertTrue(blankNode.isBlank());

        TextNode node = new TextNode("sample text");
        assertFalse(node.isBlank());
    }

}