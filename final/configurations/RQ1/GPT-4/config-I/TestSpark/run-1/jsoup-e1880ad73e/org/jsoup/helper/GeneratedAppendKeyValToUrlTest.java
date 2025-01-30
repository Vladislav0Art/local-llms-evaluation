package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValToUrlTest {

    @Test
    public void appendKeyValToUrlTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("Key", "Value") {
            @Override
            public String key() {
                return getKey();
            }

            @Override
            public String value() {
                return getValue();
            }

            @Override
            public Connection.KeyVal key(String key) {
                setKey(key);
                return this;
            }

            @Override
            public Connection.KeyVal value(String value) {
                setValue(value);
                return this;
            }
        };
        builder.appendKeyVal(kv);
        URL builtUrl = builder.build();
        assertEquals("http://example.com?Key=Value", builtUrl.toString());
    }

}