package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedLastCharIsWhitespace_ReturnsCorrectBoolean {

    @Test
    public void lastCharIsWhitespace_ReturnsCorrectBoolean() {
        StringBuilder sb = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        assertFalse(lastCharIsWhitespace(new StringBuilder()));
    }

}