package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("StringBuilder text ending with whitespace ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));

        StringBuilder sbNoWhitespace = new StringBuilder("StringBuilder text not ending with whitespace");
        assertFalse(TextNode.lastCharIsWhitespace(sbNoWhitespace));
    }

}