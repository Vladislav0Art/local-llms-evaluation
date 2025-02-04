package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_ValidNonBlankText_ReturnsFalse {

    @Test
    public void isBlank_ValidNonBlankText_ReturnsFalse() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

}