package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankReturnsFalseNonEmptyTextNode {

    @Test
    public void isBlankReturnsFalseNonEmptyTextNode() {
        String text = "not empty";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}