package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValValidInputTest {

    @Test
    public void appendKeyValValidInputTest() throws UnsupportedEncodingException, MalformedURLException {
        URL url = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);

        when(kv.key()).thenReturn("key");
        when(kv.value()).thenReturn("value");

        builder.appendKeyVal(kv);
        URL expectedURL = new URL("http://www.example.com?key=value");
        Assert.assertEquals(expectedURL, builder.build());
    }

}