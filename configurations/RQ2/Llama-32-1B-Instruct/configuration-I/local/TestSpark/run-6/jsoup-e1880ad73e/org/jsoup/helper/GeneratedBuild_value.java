package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URI;
import java.util.Map;

public class GeneratedBuild_value {

    @Test
    public void build_value() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        Map<String, String> kv = Map.of("key1", "value1");
        try (Connection.KeyVal kv2 = urlBuilder.appendKeyVal(kv)) {
            // test implementation
        }
    }

}