package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;

public class GeneratedAppend_key_val_no_key {

    @Test
    public void append_key_val_no_key() throws UnsupportedEncodingException {
        String expectedKeyValMap = "";
        URLKeyValMap kvMap = new URLKeyValMap().setKey("");
        URL actualUrl = new UrlBuilder(new URL("http://example.com")).appendKeyVal(kvMap).toString();
        assertEquals(expectedKeyValMap, actualUrl.toString());
    }

}