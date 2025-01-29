package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.BeforeEach;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_MalformedURL {

    private UrlBuilder urlBuilder;

    @BeforeEach
    public void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyVal_MalformedURL() {
        // Malformed URL
        assertFalse(urlBuilder.appendKeyVal(null).equals("https://example.com/path?%a%3D1"));
    }

}