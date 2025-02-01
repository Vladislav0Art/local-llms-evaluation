package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String unnormalized = "Test   String";
        String normalized = TextNode.normaliseWhitespace(unnormalized);
        assertEquals("Test String", normalized);
    }

}