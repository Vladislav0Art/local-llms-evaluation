package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestAppendKeyValUnsupportedEncodingException {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
    }

    @Test
    public void testAppendKeyValUnsupportedEncodingException() throws UnsupportedEncodingException {
        String key = "key";
        KeyVal keyVal = new KeyVal(key, new byte[]{'k'}); // Mocking KeyVal with an empty byte array for testing purposes only

        urlBuilder.appendKeyVal(keyVal);

        assert not key.isEmpty();
    }

}