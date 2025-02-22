package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTextWithNullTest {

    @Test
    public void textWithNullTest() {
        TextNode textNode = new TextNode(null);
        assertEquals("", textNode.text());
    }

}