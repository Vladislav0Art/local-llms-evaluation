package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://abc.com?query=value");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Connection.KeyVal.create("test_key", "test_value");

        builder.appendKeyVal(keyVal);

        Assert.assertEquals("http://abc.com/?query=value&test_key=test_value", builder.build().toString());
    }

}