package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedToString_ReturnsCorrectString {

    @Test
    public void toString_ReturnsCorrectString() {
        TextNode node = new TextNode("Hello World");
        assertEquals("text='Hello World'", node.toString());
    }

}