package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValTest_ValidKeyVal_ReturnsExpectedUrl {

    @Test
    public void appendKeyValTest_ValidKeyVal_ReturnsExpectedUrl() throws UnsupportedEncodingException, MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key1", "value1");
        URL expectedUrl = new URL("http://example.com?key1=value1");

        urlBuilder.appendKeyVal(kv);
        URL actualUrl = urlBuilder.build();

        assertEquals(expectedUrl, actualUrl);
    }

}