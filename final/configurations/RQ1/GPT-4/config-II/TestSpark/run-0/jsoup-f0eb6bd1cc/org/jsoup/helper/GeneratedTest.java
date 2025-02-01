package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructTest() throws Exception {
        URL url = new URL("http://test.com?q=abc");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(urlBuilder.u, url);
        assertEquals(urlBuilder.q.toString(), "abc");
    }

    @Test
    public void urlBuilderNoQueryConstructTest() throws Exception {
        URL url = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(urlBuilder.u, url);
        assertNull(urlBuilder.q);
    }

    @Test
    public void decodePartUnsupportedEncodingExceptionTest() throws Exception {
        URL url = new URL("http://test.com?utf=\uD83C\uDF59");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://test.com?q=abc");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("def");
        when(kv.value()).thenReturn("ghi");
        urlBuilder.appendKeyVal(kv);
        assertEquals(urlBuilder.q.toString(), "abc&def=ghi");
    }

    @Test
    public void appendKeyValEmptyQueryTest() throws Exception {
        URL url = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("abc");
        when(kv.value()).thenReturn("def");
        urlBuilder.appendKeyVal(kv);
        assertEquals(urlBuilder.q.toString(), "abc=def");
    }

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://test.com?q=abc");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL buildUrl = urlBuilder.build();
        assertEquals(buildUrl, new URL("http://test.com?q=abc"));
    }

}