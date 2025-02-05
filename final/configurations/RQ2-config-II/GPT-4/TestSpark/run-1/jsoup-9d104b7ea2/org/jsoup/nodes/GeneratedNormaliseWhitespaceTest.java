package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = "        example  \n  text";
        String normalizedText = TextNode.normaliseWhitespace(text);
        assertEquals(" example text", normalizedText);
    }

}