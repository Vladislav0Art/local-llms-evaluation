package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeIsBlankTest {

    @Test
    public void textNodeIsBlankTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}