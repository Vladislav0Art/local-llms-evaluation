package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String normalised = TextNode.normaliseWhitespace("   testing   whitespace   ");
        assertEquals(" testing whitespace ", normalised);
    }

}