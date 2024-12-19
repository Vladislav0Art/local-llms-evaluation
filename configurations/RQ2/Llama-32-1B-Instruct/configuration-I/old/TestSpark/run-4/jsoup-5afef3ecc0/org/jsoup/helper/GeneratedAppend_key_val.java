package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;

public class GeneratedAppend_key_val {

    @Test
    public void append_key_val() throws UnsupportedEncodingException {
        String expectedKeyValMap = "{\"key\":\"val\"}";
        URLKeyValMap kvMap = new URLKeyValMap().setKey("key").setValue("val");
        URL actualUrl = new UrlBuilder(new URL("http://example.com")).appendKeyVal(kvMap).toString();
        assertEquals(expectedKeyValMap, actualUrl.toString());
    }

}