package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedNormaliseWhitespaceTest_ShouldReturnNormalizedText {

    @Test
    public void normaliseWhitespaceTest_ShouldReturnNormalizedText() {
        String result = TextNode.normaliseWhitespace("  Lorem    ipsum dolor.  ");
        assertEquals("Lorem ipsum dolor.", result);
    }

}