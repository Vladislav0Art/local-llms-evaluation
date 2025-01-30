package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Hello World ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        sb = new StringBuilder("Hello World");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}