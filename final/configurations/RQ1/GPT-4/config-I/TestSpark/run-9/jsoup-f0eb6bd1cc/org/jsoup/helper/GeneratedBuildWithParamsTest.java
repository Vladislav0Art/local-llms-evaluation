package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildWithParamsTest {

    @Test
    public void buildWithParamsTest() throws Exception {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(new Connection.KeyVal() {
            @Override
            public String key() {
                return "key";
            }

            @Override
            public String value() {
                return "value";
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
            public boolean hasInputStream() {
                return false;
            }
        });

        URL expected = new URL("http://www.example.com?key=value");
        assertEquals(expected, urlBuilder.build());
    }

}