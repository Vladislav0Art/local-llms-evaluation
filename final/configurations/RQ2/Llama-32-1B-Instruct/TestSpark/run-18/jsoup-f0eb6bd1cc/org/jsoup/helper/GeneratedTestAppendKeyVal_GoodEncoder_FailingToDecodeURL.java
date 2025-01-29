package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.BeforeEach;
import org.junit.Test;

public class GeneratedTestAppendKeyVal_GoodEncoder_FailingToDecodeURL {

    @BeforeEach
    public void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToDecodeURL() throws UnsupportedEncodingException {
        // Fails to decode URL when key is null
        String inputUrl = "http://example.com/path";
        String expectedOutput = "https://example.com/path?a%3D1";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

}