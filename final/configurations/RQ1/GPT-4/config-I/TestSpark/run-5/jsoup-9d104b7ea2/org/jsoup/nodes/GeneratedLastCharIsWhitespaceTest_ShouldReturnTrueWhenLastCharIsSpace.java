package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedLastCharIsWhitespaceTest_ShouldReturnTrueWhenLastCharIsSpace {

    @Test
    public void lastCharIsWhitespaceTest_ShouldReturnTrueWhenLastCharIsSpace() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("Lorem ipsum "));
        assertTrue(result);
    }

}