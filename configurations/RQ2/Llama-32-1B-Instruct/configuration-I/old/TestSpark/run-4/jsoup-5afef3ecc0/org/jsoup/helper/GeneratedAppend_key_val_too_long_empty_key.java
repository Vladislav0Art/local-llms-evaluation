package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;

public class GeneratedAppend_key_val_too_long_empty_key {

    @Test
    public void append_key_val_too_long_empty_key() throws UnsupportedEncodingException {
        String expectedKeyValMap = "";
        try {
            new UrlBuilder(new URL("http://example.com"));
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}