package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

public class Generated[MethodUnderTest]

_appendKeyValWithUnsupportedEncodingError {

    @Test
    public void [MethodUnderTest]_appendKeyValWithUnsupportedEncodingError() {
        String inputUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        try {
            urlBuilder.appendKeyVal(new Connection.KeyVal("key", (byte[]) null));
        } catch (UnsupportedEncodingException e) {
            // Verify that the exception was thrown
        }
    }

}