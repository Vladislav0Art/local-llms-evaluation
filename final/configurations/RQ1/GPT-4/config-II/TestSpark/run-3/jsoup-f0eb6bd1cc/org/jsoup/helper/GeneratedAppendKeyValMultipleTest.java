package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class GeneratedAppendKeyValMultipleTest {

    @Test
    public void AppendKeyValMultipleTest() throws Exception {
        URL url = new URL("http://sampledomain.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(Connection.KeyVal.create("key1", "value1"));
        urlBuilder.appendKeyVal(Connection.KeyVal.create("key2", "value2"));
        Assert.assertEquals("key1=value1&key2=value2", urlBuilder.q.toString());
    }

}