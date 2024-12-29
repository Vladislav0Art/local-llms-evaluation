package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.*;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValWithUnsupportedEncodingTest {

    @Test
    public void appendKeyValWithUnsupportedEncodingTest() throws UnsupportedEncodingException, MalformedURLException {
        URL url = new URL("http://test.com");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal kv = Connection.KeyVal.create("test", "value");
        builder.appendKeyVal(kv);
    }

}