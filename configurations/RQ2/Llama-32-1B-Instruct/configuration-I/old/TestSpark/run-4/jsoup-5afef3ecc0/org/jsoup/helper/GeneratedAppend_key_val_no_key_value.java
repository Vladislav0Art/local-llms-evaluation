package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.Arrays;

public class GeneratedAppend_key_val_no_key_value {

    @Test
    public void append_key_val_no_key_value() {
        URLBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        URLKeyValMap kvMap = new URLKeyValMap();
        urlBuilder.appendKeyVal(kvMap);
        String expected = "http://example.com";
        assertEquals(expected, urlBuilder.build().toURLString());
    }

}