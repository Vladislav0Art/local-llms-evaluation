package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String normalisedText = TextNode.normaliseWhitespace(" T e s t     t e x t ");
        assertEquals("T e s t t e x t", normalisedText);
    }

}