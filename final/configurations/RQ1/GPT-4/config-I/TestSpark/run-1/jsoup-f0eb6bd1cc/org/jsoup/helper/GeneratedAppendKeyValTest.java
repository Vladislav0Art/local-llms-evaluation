package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = Connection.KeyVal.create("q", "test");
        urlBuilder.appendKeyVal(kv);
        Assert.assertEquals("q=test", urlBuilder.q.toString());
    }

}