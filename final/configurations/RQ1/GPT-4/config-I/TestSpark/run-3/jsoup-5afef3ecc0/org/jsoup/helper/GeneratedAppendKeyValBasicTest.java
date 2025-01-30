package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValBasicTest {

    @Test
    public void appendKeyValBasicTest() throws Exception {
        URL inputUrl = new URL("https://www.google.com/search");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("q", "unit test") {
            @Override
            public String key() {
                return this.getKey();
            }

            @Override
            public String value() {
                return this.getValue();
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
        urlBuilder.appendKeyVal(kv);
        URL resultUrl = urlBuilder.build();
        assertEquals("https://www.google.com/search?q=unit+test", resultUrl.toString());
    }

}