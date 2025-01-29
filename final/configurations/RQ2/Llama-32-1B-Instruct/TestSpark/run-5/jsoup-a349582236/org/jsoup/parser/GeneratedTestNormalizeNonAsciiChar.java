package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestNormalizeNonAsciiChar {

    @Test
    public void testNormalizeNonAsciiChar() {
        String input = "\u00a0World!";
        Normalizer.normalize(input, Normalizer.NFD);
        assertThat(input, is("Hello, World!"));
    }

}