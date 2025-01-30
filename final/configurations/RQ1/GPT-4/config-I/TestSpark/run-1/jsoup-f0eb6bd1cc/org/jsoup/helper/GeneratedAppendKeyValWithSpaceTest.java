package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyValWithSpaceTest {

    @Test
    public void appendKeyValWithSpaceTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = Connection.KeyVal.create("name", "john doe");
        urlBuilder.appendKeyVal(kv);
        Assert.assertEquals("name=john+doe", urlBuilder.q.toString());
    }

}