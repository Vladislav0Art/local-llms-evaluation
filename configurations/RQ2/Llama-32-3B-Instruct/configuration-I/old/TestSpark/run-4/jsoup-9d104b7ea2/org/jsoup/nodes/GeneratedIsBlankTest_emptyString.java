package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest_emptyString {

    @Test
    public void isBlankTest_emptyString() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}