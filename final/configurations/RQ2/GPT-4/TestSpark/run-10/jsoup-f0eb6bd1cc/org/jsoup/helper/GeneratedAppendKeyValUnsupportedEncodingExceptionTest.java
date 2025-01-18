package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyValue = createKeyVal("k\u00E9y", "value");
        urlBuilder.appendKeyVal(keyValue);
    }

    private Connection.KeyVal createKeyVal(String key, String value) {
        return new Connection.KeyVal() {
            @Override
            public String key() {
                return key;
            }

            @Override
            public String value() {
                return value;
            }

            @Override
            public Connection.KeyVal key(String key) {
                return null;
            }

            @Override
            public Connection.KeyVal value(String value) {
                return null;
            }

            @Override
            public String contentType() {
                return null;
            }
        };
    }

}