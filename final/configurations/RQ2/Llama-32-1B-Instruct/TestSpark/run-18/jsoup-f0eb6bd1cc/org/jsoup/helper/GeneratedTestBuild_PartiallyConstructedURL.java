package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.BeforeEach;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestBuild_PartiallyConstructedURL {

    private UrlBuilder urlBuilder;

    @BeforeEach
    public void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testBuild_PartiallyConstructedURL() {
        String inputUrl = "http://example.com/path";
        URL actual = urlBuilder.build();
        assertEquals(inputUrl, actual.toString());
    }

}