package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL testURL = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testURL);

        String testKey = "testKey";
        String testValue = "testValue";
        Connection.KeyVal keyValTest = new Connection.KeyVal() {
            @Override
            public String key() {
                return testKey;
            }

            @Override
            public String value() {
                return testValue;
            }

            @Override
            public Connection.KeyVal key(String s) {
                return null;
            }

            @Override
            public Connection.KeyVal value(String s) {
                return null;
            }

            @Override
            public String contentType() {
                return null;
            }

            @Override
            public Connection.KeyVal contentType(String ct) {
                return null;
            }
        };
        urlBuilder.appendKeyVal(keyValTest);
    }

}