package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.UnknownHostException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedBuildUrlWithPortTest {

    private Connection.KeyVal mockKeyVal(String key, String value) {
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
                return this;
            }

            @Override
            public Connection.KeyVal value(String value) {
                return this;
            }
        };
    }

    @Test
    public void buildUrlWithPortTest() throws Exception {
        URL url = new URL("http", "www.example.com", 8080, "/page1.html");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.example.com:8080/page1.html", builtUrl.toString());
    }

}