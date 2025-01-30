package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL inputUrl = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key1", "value1") {
            @Override
            public String key() {
                return this.key;
            }

            @Override
            public Connection.KeyVal key(String key) {
                this.key = key;
                return this;
            }

            @Override
            public String value() {
                return this.value;
            }

            @Override
            public Connection.KeyVal value(String value) {
                this.value = value;
                return this;
            }
        };

        urlBuilder.appendKeyVal(kv);
        URL result = urlBuilder.build();

        assertEquals("http://www.google.com?key1=value1", result.toString());
    }

}