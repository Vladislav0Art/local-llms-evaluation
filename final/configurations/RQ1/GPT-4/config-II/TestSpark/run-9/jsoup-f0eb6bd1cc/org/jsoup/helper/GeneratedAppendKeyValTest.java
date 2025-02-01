package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.URL;
import java.net.URLEncoder;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("key");
        Mockito.when(kv.value()).thenReturn("value");

        UrlBuilder urlBuilder = new URLBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);

        Assert.assertTrue(urlBuilder.q.toString().equals("key=value"));
    }

}