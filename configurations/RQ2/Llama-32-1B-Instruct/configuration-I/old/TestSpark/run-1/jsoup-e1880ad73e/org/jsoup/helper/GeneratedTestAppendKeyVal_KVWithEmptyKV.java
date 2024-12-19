package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.HashMap;

public class GeneratedTestAppendKeyVal_KVWithEmptyKV {

    @Test
    public void testAppendKeyVal_KVWithEmptyKV() {
        HashMap<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

}