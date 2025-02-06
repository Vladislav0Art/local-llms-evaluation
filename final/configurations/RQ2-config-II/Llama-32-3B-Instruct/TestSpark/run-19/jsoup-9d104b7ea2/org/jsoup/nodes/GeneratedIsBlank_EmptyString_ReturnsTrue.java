package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsBlank_EmptyString_ReturnsTrue {

    @Test
    public void isBlank_EmptyString_ReturnsTrue() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}