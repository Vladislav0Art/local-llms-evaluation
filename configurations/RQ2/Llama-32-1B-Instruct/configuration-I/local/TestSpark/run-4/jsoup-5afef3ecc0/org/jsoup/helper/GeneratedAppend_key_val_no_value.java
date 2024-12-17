package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;

public class GeneratedAppend_key_val_no_value {

    @Test
    public void append_key_val_no_value() {
        String expectedKeyValMap = "{\"key\":\"\"}";
        URLKeyValMap kvMap = new URLKeyValMap().setKey("key").setValue("");
        URL actualUrl = new UrlBuilder(new URL("http://example.com")).appendKeyVal(kvMap).toString();
        assertEquals(expectedKeyValMap, actualUrl.toString());
    }

}