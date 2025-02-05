package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValUnsupportedEncodingTest {

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL testUrl = new URL("http://www.test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);

        Connection.KeyVal keyValStub = new Connection.KeyVal() {

            @Override
            public String key() {
                return "testKey";
            }

            @Override
            public String value() {
                return "\uD800";
            }
        };

        builder.appendKeyVal(keyValStub);
    }

}