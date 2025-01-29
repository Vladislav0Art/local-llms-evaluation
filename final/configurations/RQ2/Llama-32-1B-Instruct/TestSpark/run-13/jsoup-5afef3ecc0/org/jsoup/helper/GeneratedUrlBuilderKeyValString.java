package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedUrlBuilderKeyValString {

    @Test
    public void urlBuilderKeyValString() {
        Map<String, String> kv = new HashMap<>();
        String encodedKv = URLEncoder.encode(String.valueOf(kv), "UTF-8");
        assertNotEquals("https://example.com?k=1&v=2", new URLBuilder().appendKeyVal(kv));
    }

}