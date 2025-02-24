package org.jsoup.helper;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void buildNoInputTest() {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.example.com", builtUrl.toString());
    }

    @Test
    public void buildWithInputTest() throws UnsupportedEncodingException {
        URL url = new URL("http://www.example.com");
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.getKey()).thenReturn("key");
        when(kv.getValue()).thenReturn("value");

        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(kv);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.example.com?key=value", builtUrl.toString());
    }

    @Test
    public void buildWithMultipleInputTest() throws UnsupportedEncodingException {
        URL url = new URL("http://www.example.com");
        Connection.KeyVal kv1 = mock(Connection.KeyVal.class);
        when(kv1.getKey()).thenReturn("key1");
        when(kv1.getValue()).thenReturn("value1");

        Connection.KeyVal kv2 = mock(Connection.KeyVal.class);
        when(kv2.getKey()).thenReturn("key2");
        when(kv2.getValue()).thenReturn("value2");

        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.example.com?key1=value1&key2=value2", builtUrl.toString());
    }

}