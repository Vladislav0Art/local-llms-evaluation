package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.BeforeEach;
import org.junit.Test;

public class GeneratedTestAppendKeyVal_GoodEncoder_FailingToEncodeSpecialCharsWithNonSpaceChar {

    @BeforeEach
    public void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToEncodeSpecialCharsWithNonSpaceChar() throws UnsupportedEncodingException {
        // Fails to encode special chars with non-space char when key is null
        String inputUrl = "http://example.com/path? a%3D1&b";
        String expectedOutput = "";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

}