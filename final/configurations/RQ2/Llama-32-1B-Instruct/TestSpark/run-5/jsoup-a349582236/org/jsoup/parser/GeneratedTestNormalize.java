package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestNormalize {

    @Test
    public void testNormalize() {
        String input = "Hello, World!";
        Normalizer.normalize(input, Normalizer.NFD);
        assertThat(input, is("Hello, \\u00e0orld!"));
    }

}