package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalizeWhitespaceTest {

    @Test
    public void normalizeWhitespaceTest() {
        String str = "  Some   text  ";
        String normalized = TextNode.normaliseWhitespace(str);
        assertEquals(normalized, " Some text ");
    }

}