package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL inputURL = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputURL);

        Connection.KeyVal kv = new Connection.KeyVal("key", "value") {
            @Override
            public String key() {
                return "key";
            }

            @Override
            public Connection.KeyVal key(String key) {
                return null;
            }

            @Override
            public String value() {
                return "value";
            }

            @Override
            public Connection.KeyVal value(String value) {
                return null;
            }
        };

        urlBuilder.appendKeyVal(kv);

        URL resultURL = urlBuilder.build();

        assertEquals("http://www.example.com?key=value", resultURL.toString());
    }

}