package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTestWithNullKey {

    @Test
    public void appendKeyValTestWithNullKey() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal(null, "value");
        urlBuilder.appendKeyVal(kv);
        assertEquals("=value", urlBuilder.query());
    }

}