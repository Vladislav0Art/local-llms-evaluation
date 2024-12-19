package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Generated[MethodUnderTest]

TestAppendNull {

    @Test
    public void [MethodUnderTest]TestAppendNull() {
        Map<String, String> kv = new HashMap<>();
        kv.put("key", null);
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

}