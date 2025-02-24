package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void buildTest() {
        URL inputUrl = null;
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertNull(result);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = null;
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.setKey("key");
        kv.setValue("value");
        builder.appendKeyVal(kv);
        assertEquals("key=value", builder.query());
    }

    @Test
    public void appendKeyValExceptionTest() throws UnsupportedEncodingException {
        URL inputUrl = null;
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.setKey("key");
        kv.setValue("value");
        builder.appendKeyVal(kv);
        throw new UnsupportedEncodingException();
    }

}