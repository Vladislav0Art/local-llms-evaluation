package org.jsoup.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppend_key_val_throws UnsupportedEncodingException_for_non_string_value {

    private Map<String, String> urlMap = new HashMap<>();

    @BeforeEach
    public void setUp() {
        for (int i = 0; i < 10; i++) {
            urlMap.put(i + "key", URLEncoder.encode("value_" + i, StandardCharsets.UTF_8));
        }
    }

    @Test
    public void append_key_val_throws

    UnsupportedEncodingException_for_non_string_value() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        Map<String, String> kv = Map.of(1, "value_0");
        try {
            builder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException to be thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}