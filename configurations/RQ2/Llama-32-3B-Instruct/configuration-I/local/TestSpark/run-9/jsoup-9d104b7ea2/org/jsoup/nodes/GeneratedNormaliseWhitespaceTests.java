package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceTests {

    @Test
    public void normaliseWhitespaceTests() {
        String text = "   ";
        assertEquals("   ", TextNode.normaliseWhitespace(text));
    }

}