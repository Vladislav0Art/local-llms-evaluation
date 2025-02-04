package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedIsBlank_GivenTextNode_ReturnsCorrectValue {

    @Test
    public void isBlank_GivenTextNode_ReturnsCorrectValue() {
        TextNode textNode = new TextNode(" ");
        assertTrue(textNode.isBlank());
        textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

}