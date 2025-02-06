package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Appendable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public class GeneratedToString_returnsCorrectString {

    @Test
    public void toString_returnsCorrectString() {
        String expectedText = "expected";
        TextNode textNode = new TextNode(expectedText);
        assertEquals(expectedText, textNode.toString());
    }

}