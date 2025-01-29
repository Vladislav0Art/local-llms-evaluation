package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.BeforeEach;
import org.junit.Test;

public class GeneratedTestAppendKeyVal_GoodEncoder_FailingToEncodeSpecialCharsWithNonSpaceCharAndSpace {

    @BeforeEach
    public void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyVal_GoodEncoder_FailingToEncodeSpecialCharsWithNonSpaceCharAndSpace() throws UnsupportedEncodingException {
        // Fails to encode special chars with space and non-space char when key is null
        String inputUrl = "http://example.com/path? a%3D1&b";
        String expectedOutput = "";
        assertEquals(expectedOutput, urlBuilder.appendKeyVal(null).toString());
    }

}