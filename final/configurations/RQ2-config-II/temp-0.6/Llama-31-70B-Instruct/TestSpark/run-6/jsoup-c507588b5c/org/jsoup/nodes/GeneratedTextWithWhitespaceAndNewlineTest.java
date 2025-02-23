package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTextWithWhitespaceAndNewlineTest {

    @Test
    public void textWithWhitespaceAndNewlineTest() {
        TextNode textNode = new TextNode("   Text\nText   ");
        assertEquals("Text Text", textNode.text());
    }

}