package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedAppendKVWithValidUrl {

    @Test
    public void appendKVWithValidUrl() {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        org.jsoup.Connection.KeyVal keyVal = new ConnectionKeyVal("key", "value");
        try {
            urlBuilder.appendKeyVal(keyVal);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

}