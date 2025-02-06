package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedToStringReturnsCorrectString {

    @Test
    public void toStringReturnsCorrectString() {
        String text = "textNode";
        TextNode node = new TextNode(text);
        assertEquals("textNode", node.toString());
    }

}