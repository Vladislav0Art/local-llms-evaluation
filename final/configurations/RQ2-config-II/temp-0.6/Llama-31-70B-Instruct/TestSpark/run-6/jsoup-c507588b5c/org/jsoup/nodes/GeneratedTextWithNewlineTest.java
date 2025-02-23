package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTextWithNewlineTest {

    @Test
    public void textWithNewlineTest() {
        TextNode textNode = new TextNode("Text\nText");
        assertEquals("Text Text", textNode.text());
    }

}