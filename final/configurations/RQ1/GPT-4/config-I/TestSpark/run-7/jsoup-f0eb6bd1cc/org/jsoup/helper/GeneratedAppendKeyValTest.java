package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder obj = new UrlBuilder(inputUrl);
        obj.appendKeyVal(new Connection.KeyVal() {
            @Override
            public String key() {
                return "key";
            }

            @Override
            public String value() {
                return "value";
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

            @Override
            public boolean hasInputStream() {
                return false;
            }
        });

        URL builtUrl = obj.build();
        assertTrue(builtUrl.getQuery().contains("key=value"));
    }

}