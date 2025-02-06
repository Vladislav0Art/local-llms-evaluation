package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsBlank_NonEmptyString_ReturnsFalse {

    @Test
    public void isBlank_NonEmptyString_ReturnsFalse() {
        TextNode node = new TextNode("Hello World");
        assertFalse(node.isBlank());
    }

}