package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValWhenValueIsEmptyTest {

    @Test
    public void appendKeyValWhenValueIsEmptyTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));

        urlBuilder.appendKeyVal(Connection.KeyVal.create("page", ""));

        Assert.assertEquals("http://www.example.com?page=", urlBuilder.build().toString());
    }

}