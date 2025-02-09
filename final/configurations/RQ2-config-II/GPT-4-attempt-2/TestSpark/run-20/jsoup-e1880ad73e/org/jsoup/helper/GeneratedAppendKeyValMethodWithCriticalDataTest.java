package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValMethodWithCriticalDataTest {

    @Test
    public void appendKeyValMethodWithCriticalDataTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);

        Connection.KeyVal kv = new Connection.KeyVal("critical", "data");
        builder.appendKeyVal(kv);

        Assert.assertTrue(builder.build().toString().contains("critical=data"));
    }

}