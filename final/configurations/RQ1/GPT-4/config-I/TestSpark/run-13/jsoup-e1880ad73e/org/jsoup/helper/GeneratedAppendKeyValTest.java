package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(keyVal("key", "value"));
        URL normalizedUrl = new URL("http://example.com?key=value");
        assertEquals(normalizedUrl, builder.build());
    }

    private Connection.KeyVal keyVal(final String key, final String value) {
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
            public Connection.KeyVal key(String s) {
                return this;
            }

            @Override
            public Connection.KeyVal value(String s) {
                return this;
            }

            @Override
            public String contentType() {
                return null;
            }
        };
    }

}