package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlank_EmptyTextNode_ReturnsTrue {

    @Test
    public void isBlank_EmptyTextNode_ReturnsTrue() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}