package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTextNodeReturnsFalse {

    @Test
    public void isBlankTextNodeReturnsFalse() {
        String nonBlankText = "Hello World!";
        TextNode textNode = new TextNode(nonBlankText);
        assertFalse(textNode.isBlank());
    }

}