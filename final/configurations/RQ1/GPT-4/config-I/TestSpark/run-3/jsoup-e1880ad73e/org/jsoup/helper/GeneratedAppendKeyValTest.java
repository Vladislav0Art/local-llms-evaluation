package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("param", "value") {
            @Override
            public String key() {
                return "param";
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
        };
        builder.appendKeyVal(kv);
        Assert.assertEquals(builder.q.toString(), "param=value");
    }

}