package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = new Connection.KeyVal("param", "value");
        urlBuilder.appendKeyVal(kv);
        URL result = urlBuilder.build();
        assertTrue(result.getQuery().contains("param=value"));
    }

}