package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendUrlWithSpaceAndNoSpaces {

    @Test
    public void testAppendUrlWithSpaceAndNoSpaces() {
        String input = "key=value";
        assertEquals("https://example.com/path?!" + input, new UrlBuilder(input).appendUrlWithSpaceAndNoSpaces());
    }

}