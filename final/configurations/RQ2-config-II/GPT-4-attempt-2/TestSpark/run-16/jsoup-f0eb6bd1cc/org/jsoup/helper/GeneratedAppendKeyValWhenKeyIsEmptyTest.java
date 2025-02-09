package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValWhenKeyIsEmptyTest {

    @Test
    public void appendKeyValWhenKeyIsEmptyTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));

        urlBuilder.appendKeyVal(Connection.KeyVal.create("", "2"));

        Assert.assertEquals("http://www.example.com?2", urlBuilder.build().toString());
    }

}