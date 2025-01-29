package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedUrlBuilderKeyValEmptyList {

    @Test
    public void urlBuilderKeyValEmptyList() {
        String inputUrl = "https://example.com";
        Map<String, String> kv = new HashMap<>();
        String encodedKv = URLEncoder.encode(String.valueOf(kv), "UTF-8");
        assertEquals(inputUrl, new URLBuilder().appendKeyVal(kv));
    }

}