package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.BeforeEach;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_GoodEncoder {

    private UrlBuilder urlBuilder;

    @BeforeEach
    public void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyVal_GoodEncoder() {
        String inputUrl = "http://example.com/path";
        String expectedOutput = "https://example.com/path?a%3D1";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(new java.util.HashMap<>()).toString());
    }

}