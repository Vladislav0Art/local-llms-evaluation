package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyVal_ValidKeyVal {

    // Tests for the build() method

    @Test
    public void appendKeyVal_ValidKeyVal() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        KeyVal keyVal = new KeyVal("key", "value", false);
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("https://www.example.com?key=value", urlBuilder.build().toString());
    }

}