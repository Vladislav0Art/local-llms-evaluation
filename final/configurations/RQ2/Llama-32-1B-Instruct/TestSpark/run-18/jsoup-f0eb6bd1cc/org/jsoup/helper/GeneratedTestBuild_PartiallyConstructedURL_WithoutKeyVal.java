package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.BeforeEach;
import org.junit.Test;

public class GeneratedTestBuild_PartiallyConstructedURL_WithoutKeyVal {

    @BeforeEach
    public void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testBuild_PartiallyConstructedURL_WithoutKeyVal() {
        String inputUrl = "http://example.com/path";
        URL actual = urlBuilder.build();
        assertEquals(inputUrl, actual.toString());
    }

}