package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedUrlBuilderKeyValStringUnquoted {

    @Test
    public void urlBuilderKeyValStringUnquoted() {
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        assertEquals("https://example.com?key=value", new URLBuilder().appendKeyVal(kv));
    }

}