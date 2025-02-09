package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String result = TextNode.normaliseWhitespace("   normalize     this     ");
        assertNotNull(result);
        assertEquals(" normalize this ", result);
    }

}