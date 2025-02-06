package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNormaliseWhitespaceReturnsNormalisedString {

    @Test
    public void normaliseWhitespaceReturnsNormalisedString() {
        String expectedText = "normalisedText";
        TextNode testNode = new TextNode(expectedText);
        String result = TextNode.normaliseWhitespace(testNode.text());
        assertEquals("expectedText", result);
    }

}