package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.io.IOException;

public class GeneratedIsBlankEmptyTextNodeTest {

    @Test
    public void isBlankEmptyTextNodeTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}