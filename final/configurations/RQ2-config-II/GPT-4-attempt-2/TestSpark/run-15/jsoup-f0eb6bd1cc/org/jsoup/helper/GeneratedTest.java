package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void buildForValidURLTest() throws MalformedURLException {
        URL url = new URL("https://www.google.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(url, builder.build());
    }

    @Test
    public void buildForNullURLTest() {
        URL url = null;
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

    @Test
    public void appendKeyValNormalTest() throws UnsupportedEncodingException {
        URL url = new URL("https://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);

        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value");

        builder.appendKeyVal(keyVal);
        URL expectedUrl = new URL("https://www.example.com?key=value");

        assertEquals(expectedUrl, builder.build());
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL url = new URL("https://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);

        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value\uFFFF");

        builder.appendKeyVal(keyVal);  // cause UnsupportedEncodingException
    }

}