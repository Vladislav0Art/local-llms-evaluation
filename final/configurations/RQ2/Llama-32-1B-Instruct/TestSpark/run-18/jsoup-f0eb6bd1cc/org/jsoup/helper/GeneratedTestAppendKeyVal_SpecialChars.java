package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.BeforeEach;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_SpecialChars {

    private UrlBuilder urlBuilder;

    @BeforeEach
    public void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyVal_SpecialChars() throws UnsupportedEncodingException {
        String inputUrl = "http://example.com/path?ä=1";
        String expectedOutput = "https://example.com/path?ä=1&b=%22c%22";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(new java.util.HashMap<>()).toString());
    }

}