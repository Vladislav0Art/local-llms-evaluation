package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode blankNode = new TextNode("     ");
        assertTrue(blankNode.isBlank());

        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

}