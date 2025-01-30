package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.Validate;
import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://example.com?key=value");
        UrlBuilder builder = new UrlBuilder(url);

        builder.appendKeyVal(new Connection.KeyVal() {
            @Override
            public String key() {
                return "key2";
            }

            @Override
            public String value() {
                return "value2";
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
            public Connection.KeyVal contentType(String contentType) {
                return null;
            }

            @Override
            public String contentType() {
                return null;
            }

            @Override
            public String toString() {
                return "key2=value2";
            }
        });

        assertEquals(url + "&key2=value2", builder.build().toString());
    }

}