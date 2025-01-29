package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestNormalizeNoSpaces {

    @Test
    public void testNormalizeNoSpaces() {
        String input = "Hello";
        Normalizer.normalize(input, Normalizer.NFD);
        assertThat(input, is("Hello"));
    }

}