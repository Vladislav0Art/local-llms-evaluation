package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceTests {

    @Test
    public void lastCharIsWhitespaceTests() {
        StringBuilder sb = new StringBuilder("abc ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}