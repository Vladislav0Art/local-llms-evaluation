package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTest lastCharIsWhitespace {

    @Test
    public void test

    lastCharIsWhitespace() {
        String text = "Hello!";
        assertTrue(lastCharIsWhitespace(new StringBuilder(text)).equals(true));
        assertFalse(lastCharIsWhitespace(new StringBuilder(text)));
    }

}