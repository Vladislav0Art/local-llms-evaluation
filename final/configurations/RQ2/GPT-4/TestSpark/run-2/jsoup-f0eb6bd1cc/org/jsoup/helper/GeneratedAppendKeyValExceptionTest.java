package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValExceptionTest {

    @Test
    public void appendKeyValExceptionTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "测\uD840\uDC00");
        builder.appendKeyVal(kv);
    }

}