package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTest normaliseWhitespace {

    @Test
    public void test

    normaliseWhitespace() {
        String text = "   ";
        String result = normalizeWhitespace(text);
        assertTrue(result.equals(" "));
    }

}