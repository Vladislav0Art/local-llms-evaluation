package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String normalizedText = TextNode.normaliseWhitespace(" T e s t ");
        assertEquals("T e s t", normalizedText);
    }

}