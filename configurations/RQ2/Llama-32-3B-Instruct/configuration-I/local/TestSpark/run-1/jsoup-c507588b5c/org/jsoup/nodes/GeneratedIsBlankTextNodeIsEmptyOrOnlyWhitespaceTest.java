package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedIsBlankTextNodeIsEmptyOrOnlyWhitespaceTest {

    @Test
    public void isBlankTextNodeIsEmptyOrOnlyWhitespaceTest() {
        String originalText = "   ";
        TextNode node = new TextNode(originalText);
        assertTrue(node.isBlank());

        String blankTextNode = "";
        TextNode blankNode = new TextNode(blankTextNode);
        assertTrue(blankNode.isBlank());
    }

}