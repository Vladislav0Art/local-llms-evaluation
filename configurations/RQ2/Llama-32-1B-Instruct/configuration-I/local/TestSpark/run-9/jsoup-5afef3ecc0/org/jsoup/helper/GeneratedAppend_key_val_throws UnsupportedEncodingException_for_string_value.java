package org.jsoup.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppend_key_val_throws UnsupportedEncodingException_for_string_value {

    private Map<String, String> urlMap = new HashMap<>();

    @BeforeEach
    public void setUp() {
        for (int i = 0; i < 10; i++) {
            urlMap.put(i + "key", URLEncoder.encode("value_" + i, StandardCharsets.UTF_8));
        }
    }

    @Test
    public void append_key_val_throws

    UnsupportedEncodingException_for_string_value() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        String value = "value_0";
        int index = 1;
        Map<String, String> kv = Map.of(0, URLEncoder.encode(value, StandardCharsets.UTF_8), index.toString());
        try {
            builder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException to be thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}