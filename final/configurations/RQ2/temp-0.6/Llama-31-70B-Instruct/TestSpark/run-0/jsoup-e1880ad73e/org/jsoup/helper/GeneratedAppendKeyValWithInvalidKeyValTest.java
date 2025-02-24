package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAppendKeyValWithInvalidKeyValTest {

    private static final String URL_STRING = "https://www.example.com";
    private static final String KEY = "key";
    private static final String VALUE = "value";

    @Test
    public void appendKeyValWithInvalidKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL(URL_STRING);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("invalid key", "invalid value");
        urlBuilder.appendKeyVal(kv);
    }

}