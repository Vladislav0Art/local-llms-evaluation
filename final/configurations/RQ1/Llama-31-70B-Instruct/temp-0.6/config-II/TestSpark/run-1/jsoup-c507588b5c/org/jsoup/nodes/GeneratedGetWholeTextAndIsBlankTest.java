package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedGetWholeTextAndIsBlankTest {

    @Test
    public void getWholeTextAndIsBlankTest() {
        TextNode textNode = new TextNode("  test  \n");
        assertEquals("  test  \n", textNode.getWholeText());
        assertFalse(textNode.isBlank());
    }

}