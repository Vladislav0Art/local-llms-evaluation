package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.UnknownHostException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedBuildUrlWithNonAsciiCharactersTest {

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
    public void buildUrlWithNonAsciiCharactersTest() throws Exception {
        URL url = new URL("http", "www.èxample.com", "/pàgé1.html");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.xn--xample-9ua.com/p%C3%A0g%C3%A91.html", builtUrl.toString());
    }

}