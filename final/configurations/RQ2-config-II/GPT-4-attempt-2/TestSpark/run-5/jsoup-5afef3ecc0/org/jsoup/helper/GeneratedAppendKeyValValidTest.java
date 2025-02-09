package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValValidTest {

    @Test
    public void appendKeyValValidTest() throws UnsupportedEncodingException, MalformedURLException {
        Connection.KeyVal keyVal = Connection.KeyVal.create("name", "value");
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(keyVal);
        URL outputUrl = urlBuilder.build();
        assertEquals("http://example.com?name=value", outputUrl.toString());
    }

}