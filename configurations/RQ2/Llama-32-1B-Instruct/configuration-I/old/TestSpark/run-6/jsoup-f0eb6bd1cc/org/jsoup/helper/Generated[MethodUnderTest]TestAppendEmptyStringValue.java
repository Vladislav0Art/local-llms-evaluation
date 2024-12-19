package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Generated[MethodUnderTest]

TestAppendEmptyStringValue {

    @Test
    public void [MethodUnderTest]TestAppendEmptyStringValue() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(new HashMap<>());
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

}