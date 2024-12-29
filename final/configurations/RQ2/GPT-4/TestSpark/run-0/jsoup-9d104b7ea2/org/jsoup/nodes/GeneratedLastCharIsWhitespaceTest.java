package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Test Text ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        sb = new StringBuilder("Test Text");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}