package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

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

            @Override
            public String contentType() {
                return null;
            }

            @Override
            public Connection.KeyVal contentType(String contentType) {
                return this;
            }

            @Override
            public boolean hasInputStream() {
                return false;
            }
        };
    }

}