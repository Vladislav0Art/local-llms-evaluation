package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValWhenKeyAndValueArePresentTest {

    @Test
    public void appendKeyValWhenKeyAndValueArePresentTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));

        urlBuilder.appendKeyVal(Connection.KeyVal.create("page", "2"));

        Assert.assertEquals("http://www.example.com?page=2", urlBuilder.build().toString());
    }

}