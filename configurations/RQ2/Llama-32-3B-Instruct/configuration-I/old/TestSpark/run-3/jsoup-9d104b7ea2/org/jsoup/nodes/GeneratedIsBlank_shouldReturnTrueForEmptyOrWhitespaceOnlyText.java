package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedIsBlank_shouldReturnTrueForEmptyOrWhitespaceOnlyText {

    @Test
    public void isBlank_shouldReturnTrueForEmptyOrWhitespaceOnlyText() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());

        String whitespaceOnlyText = "   ";
        node = new TextNode(whitespaceOnlyText);
        assertTrue(node.isBlank());
    }

}