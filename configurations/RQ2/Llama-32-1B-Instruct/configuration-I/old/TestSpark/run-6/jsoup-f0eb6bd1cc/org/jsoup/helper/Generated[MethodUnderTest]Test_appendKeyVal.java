package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Generated[MethodUnderTest]

Test_appendKeyVal {

    @Test
    public void [MethodUnderTest]Test_appendKeyVal() {
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        String expected = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);
        assertEquals(expected, urlBuilder.build().toString());
    }

}