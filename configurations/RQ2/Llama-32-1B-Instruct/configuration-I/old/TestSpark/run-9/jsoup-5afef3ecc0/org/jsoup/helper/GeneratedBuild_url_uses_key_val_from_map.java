package org.jsoup.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuild_url_uses_key_val_from_map {

    private Map<String, String> urlMap = new HashMap<>();

    @BeforeEach
    public void setUp() {
        for (int i = 0; i < 10; i++) {
            urlMap.put(i + "key", URLEncoder.encode("value_" + i, StandardCharsets.UTF_8));
        }
    }

    @Test
    public void build_url_uses_key_val_from_map() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        String expectedUrl = "https://example.com/value_0";
        assertEquals(expectedUrl, builder.build().toURI());
    }

}