package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlWithBasicFormat {

    @Test
    public void buildUrlWithBasicFormat() {
        String url = "http://example.com/path?query=value";
        UrlBuilder builder = new UrlBuilder(url);
        String expectedResult = "http://example.com/path?query=value";
        assertEquals(expectedResult, builder.build());
    }

}