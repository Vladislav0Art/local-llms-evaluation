package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedAppendKVWithInvalidUrl {

    @Test
    public void appendKVWithInvalidUrl() {
        URL url = null;
        UrlBuilder urlBuilder = new UrlBuilder(url);
        org.jsoup.Connection.KeyVal keyVal = new ConnectionKeyVal("key", "value");
        try {
            urlBuilder.appendKeyVal(keyVal);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

}