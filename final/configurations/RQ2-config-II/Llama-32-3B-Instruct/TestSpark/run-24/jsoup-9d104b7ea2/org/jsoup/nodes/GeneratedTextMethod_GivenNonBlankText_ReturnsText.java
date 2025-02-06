package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTextMethod_GivenNonBlankText_ReturnsText {

    @Test
    public void textMethod_GivenNonBlankText_ReturnsText() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("Hello, World!", textNode.text());
    }

}