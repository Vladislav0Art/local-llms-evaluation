package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;

public class GeneratedAppend_key_val_unsupportedEncodingException {

    @Test
    public void append_key_val_unsupportedEncodingException() throws UnsupportedEncodingException {
        String expectedKeyValMap = "{\"key\":\"val\"}";
        try {
            new UrlBuilder(new URL("http://example.com"));
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}