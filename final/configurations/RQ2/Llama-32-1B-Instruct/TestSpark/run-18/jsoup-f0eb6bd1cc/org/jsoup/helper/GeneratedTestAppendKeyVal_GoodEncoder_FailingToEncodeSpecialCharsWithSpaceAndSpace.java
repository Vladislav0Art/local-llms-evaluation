package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.BeforeEach;
import org.junit.Test;

public class GeneratedTestAppendKeyVal_GoodEncoder_FailingToEncodeSpecialCharsWithSpaceAndSpace {

    @BeforeEach
    public void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToEncodeSpecialCharsWithSpaceAndSpace() throws UnsupportedEncodingException {
        // Fails to encode special chars with space and another space when key is null
        String inputUrl = "http://example.com/path? a%20b%2Cc";
        String expectedOutput = "";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

}