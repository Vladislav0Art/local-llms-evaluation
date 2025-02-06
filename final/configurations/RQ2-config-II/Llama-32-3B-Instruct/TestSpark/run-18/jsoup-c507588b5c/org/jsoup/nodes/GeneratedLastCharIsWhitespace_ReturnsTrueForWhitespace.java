package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedLastCharIsWhitespace_ReturnsTrueForWhitespace {

    @Test
    public void lastCharIsWhitespace_ReturnsTrueForWhitespace() {
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}