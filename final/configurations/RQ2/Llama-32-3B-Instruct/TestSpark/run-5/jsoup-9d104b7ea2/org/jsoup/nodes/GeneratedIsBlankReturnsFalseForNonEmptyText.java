package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedIsBlankReturnsFalseForNonEmptyText {

    @Test
    public void isBlankReturnsFalseForNonEmptyText() {
        TextNode node = new TextNode("text");
        assertFalse(node.isBlank());
    }

}