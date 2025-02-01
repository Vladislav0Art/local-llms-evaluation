package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://sampledomain.com");
        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(keyVal);
        Assert.assertEquals("key=value", urlBuilder.q.toString());
    }

}