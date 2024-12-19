package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URI;
import java.util.Map;

public class GeneratedBuild_key {

    @Test
    public void build_key() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        URL result = urlBuilder.build();
        try (Connection.KeyVal kv = urlBuilder.appendKeyVal(Map.of("key1", "value1"))) {
            // test implementation
        }
    }

}