package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTextMethod_GivenBlankText_ReturnsBlankString {

    @Test
    public void textMethod_GivenBlankText_ReturnsBlankString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

}