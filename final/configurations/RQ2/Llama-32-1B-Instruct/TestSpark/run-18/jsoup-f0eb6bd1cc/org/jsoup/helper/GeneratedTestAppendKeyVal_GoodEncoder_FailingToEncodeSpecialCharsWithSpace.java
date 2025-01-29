package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.BeforeEach;
import org.junit.Test;

public class GeneratedTestAppendKeyVal_GoodEncoder_FailingToEncodeSpecialCharsWithSpace {

    @BeforeEach
    public void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToEncodeSpecialCharsWithSpace() throws UnsupportedEncodingException {
        // Fails to encode special chars with space when key is null
        String inputUrl = "http://example.com/path? a%20b&c";
        String expectedOutput = "";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

}