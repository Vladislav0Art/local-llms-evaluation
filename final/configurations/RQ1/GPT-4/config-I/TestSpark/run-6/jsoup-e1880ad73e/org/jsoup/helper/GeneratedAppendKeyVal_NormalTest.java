package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedAppendKeyVal_NormalTest {

    @Test
    public void appendKeyVal_NormalTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("name", "John");
        urlBuilder.appendKeyVal(kv);
        assertEquals("?name=John", urlBuilder.q.toString());
    }

}