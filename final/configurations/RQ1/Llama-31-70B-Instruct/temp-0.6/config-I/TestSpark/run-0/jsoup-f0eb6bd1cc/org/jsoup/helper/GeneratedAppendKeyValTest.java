package org.jsoup.helper;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    private static UrlBuilder urlBuilder;
    private static URL url;

    @BeforeClass
    public static void setUp() throws Exception {
        url = Mockito.mock(URL.class);
        Mockito.when(url.getProtocol()).thenReturn("https");
        Mockito.when(url.getHost()).thenReturn("www.example.com");
        Mockito.when(url.getPath()).thenReturn("/test");
        Mockito.when(url.getQuery()).thenReturn("param1=value1&param2=value2");
        Mockito.when(url.getRef()).thenReturn("anchor");
        Mockito.when(url.getPort()).thenReturn(80);
        Mockito.when(url.getUserInfo()).thenReturn("user:password");

        urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        org.jsoup.Connection.KeyVal keyVal = Mockito.mock(org.jsoup.Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("key");
        Mockito.when(keyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyVal);

        assertEquals("key=value", urlBuilder.q.toString());
    }

}