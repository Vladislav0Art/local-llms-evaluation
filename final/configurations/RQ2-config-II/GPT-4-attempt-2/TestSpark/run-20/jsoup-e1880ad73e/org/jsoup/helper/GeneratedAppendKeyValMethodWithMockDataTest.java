package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValMethodWithMockDataTest {

    @Test
    public void appendKeyValMethodWithMockDataTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);

        // Mock object
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("key");
        Mockito.when(kv.value()).thenReturn("value");

        builder.appendKeyVal(kv);

        Assert.assertTrue(builder.build().toString().contains("key=value"));
    }

}