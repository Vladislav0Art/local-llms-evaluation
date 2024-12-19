package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.HashMap;

public class GeneratedTestAppendKeyVal_KV {

    @Test
    public void testAppendKeyVal_KV() {
        HashMap<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        urlBuilder.appendKeyVal(kv);
        assert urlBuilder.build().orElseThrow().getKeys().containsKey("key") && urlBuilder.build().orElseThrow().getValues().containsValue("value");
    }

}