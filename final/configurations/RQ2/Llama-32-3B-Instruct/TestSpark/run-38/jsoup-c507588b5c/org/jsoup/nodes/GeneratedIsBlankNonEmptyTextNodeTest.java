package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.io.IOException;

public class GeneratedIsBlankNonEmptyTextNodeTest {

    @Test
    public void isBlankNonEmptyTextNodeTest() {
        TextNode textNode = new TextNode("Hello, World!");
        assertFalse(textNode.isBlank());
    }

}