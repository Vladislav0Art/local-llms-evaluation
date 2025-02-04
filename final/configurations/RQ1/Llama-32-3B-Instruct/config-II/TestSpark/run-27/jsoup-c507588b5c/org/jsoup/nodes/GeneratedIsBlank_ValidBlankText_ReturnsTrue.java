package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_ValidBlankText_ReturnsTrue {

    @Test
    public void isBlank_ValidBlankText_ReturnsTrue() throws IOException {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

}