package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = " normalize    whitespace";
        String normalizedSpace = TextNode.normaliseWhitespace(text);
        assertEquals(" normalize whitespace", normalizedSpace);
    }

}