package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.HashMap;

public class GeneratedTestAppendKeyVal_KVWithNoKeys {

    @Test
    public void testAppendKeyVal_KVWithNoKeys() {
        HashMap<String, String> kv = new HashMap<>();
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(null);
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

}