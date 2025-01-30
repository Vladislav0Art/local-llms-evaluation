package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderAppendKeyValTest {

    @Test
    public void urlBuilderAppendKeyValTest() throws Exception {
        URL inputUrl = new URL("http://google.com/search");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value") {
            @Override
            public String key() {
                return "key";
            }

            @Override
            public String value() {
                return "value";
            }

            @Override
            public KeyVal key(String key) {
                return this;
            }

            @Override
            public KeyVal value(String value) {
                return this;
            }
        };
        urlBuilder.appendKeyVal(kv);

        assertEquals("key=value", urlBuilder.q.toString());
    }

}