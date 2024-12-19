package org.jsoup.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppend_key_val_sets_url_key_in_url_string {

    private Map<String, String> urlMap = new HashMap<>();

    @BeforeEach
    public void setUp() {
        for (int i = 0; i < 10; i++) {
            urlMap.put(i + "key", URLEncoder.encode("value_" + i, StandardCharsets.UTF_8));
        }
    }

    @Test
    public void append_key_val_sets_url_key_in_url_string() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        String key = "value";
        Map<String, String> kv = Map.of(key, URLEncoder.encode(String.valueOf(key), StandardCharsets.UTF_8));
        int index = 1;
        String[] expectedUrlParts = {"https://example.com", key, URLEncoder.encode(String.valueOf(index), StandardCharsets.UTF_8)};
        assertEquals(expectedUrlParts[0], builder.appendKeyVal(kv).toURI().toString());
    }

}