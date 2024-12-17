package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Generated[MethodUnderTest]

TestAppendEmptyString {

    @Test
    public void [MethodUnderTest]TestAppendEmptyString() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(new HashMap<>());
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

}