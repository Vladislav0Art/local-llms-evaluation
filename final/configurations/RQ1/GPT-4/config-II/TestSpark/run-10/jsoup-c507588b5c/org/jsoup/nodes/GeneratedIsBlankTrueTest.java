package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTrueTest {

    @Test
    public void isBlankTrueTest() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

}