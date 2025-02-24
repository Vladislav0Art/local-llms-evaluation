package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedAppendKeyValWithInvalidKeyValTest {

    @Test
    public void appendKeyValWithInvalidKeyValTest() throws Exception {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "");

        urlBuilder.appendKeyVal(kv);
    }

}