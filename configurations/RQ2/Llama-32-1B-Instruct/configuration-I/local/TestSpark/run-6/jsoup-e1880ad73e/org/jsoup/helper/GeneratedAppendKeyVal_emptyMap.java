package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URI;
import java.util.Map;

public class GeneratedAppendKeyVal_emptyMap {

    @Test
    public void appendKeyVal_emptyMap() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        Map<String, String> kv = Map.of();
        try (Connection.KeyVal kv2 = urlBuilder.appendKeyVal(kv)) {
            // test implementation
        }
    }

}