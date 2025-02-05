package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        String key = "key";
        String value = "value";
        Connection.KeyVal kv = Connection.KeyVal.create(key, value);

        urlBuilder.appendKeyVal(kv);

        URL outputUrl = urlBuilder.build();
        URL expectedUrl = new URL("http://example.com?" + key + "=" + value);

        assertEquals(expectedUrl, outputUrl);
    }

}