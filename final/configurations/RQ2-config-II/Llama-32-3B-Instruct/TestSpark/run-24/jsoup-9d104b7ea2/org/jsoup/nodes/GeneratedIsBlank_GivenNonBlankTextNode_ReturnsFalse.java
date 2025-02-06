package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_GivenNonBlankTextNode_ReturnsFalse {

    @Test
    public void isBlank_GivenNonBlankTextNode_ReturnsFalse() {
        TextNode textNode = new TextNode("Hello, World!");
        assertFalse(textNode.isBlank());
    }

}