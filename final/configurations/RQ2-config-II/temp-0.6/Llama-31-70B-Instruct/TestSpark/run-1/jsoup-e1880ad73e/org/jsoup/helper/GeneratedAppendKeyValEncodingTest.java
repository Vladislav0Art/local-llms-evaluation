package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GeneratedAppendKeyValEncodingTest {

    @Test
    public void appendKeyValEncodingTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("name", "value with space");
        urlBuilder.appendKeyVal(kv);
        assertEquals("name=value+with+space", urlBuilder.getQuery());
    }

}