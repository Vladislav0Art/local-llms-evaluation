package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Generated[MethodUnderTest]

TestAppendKeyValUnsupported {

    @Test
    public void [MethodUnderTest]TestAppendKeyValUnsupported() {
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

}