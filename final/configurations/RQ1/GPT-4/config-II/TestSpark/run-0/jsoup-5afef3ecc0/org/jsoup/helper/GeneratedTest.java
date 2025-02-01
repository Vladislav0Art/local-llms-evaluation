package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void buildWithoutQueryParamTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL expectedUrl = new URL("http://example.com");
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void buildWithQueryParamTest() throws Exception {
        URL url = new URL("http://example.com?param=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL expectedUrl = new URL("http://example.com?param=value");
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void buildWithNonAsciiTest() throws Exception {
        URL url = new URL("http://example.com/年");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL expectedUrl = new URL("http://example.com/%E5%B9%B4");
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("key");
        Mockito.when(kv.value()).thenReturn("value");
        urlBuilder.appendKeyVal(kv);
        URL expectedUrl = new URL("http://example.com?key=value");
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void decodePartUnsupportedTest() throws Exception {
        URL url = new URL("http://example.com/年");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URLDecoder.decode(url.getHost(), "Unsupported");
    }

    @Test
    public void normalizeQueryTest() throws Exception {
        URL url = new URL("http://example.com?param=value with space");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL expectedUrl = new URL("http://example.com?param=value+with+space");
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void normalizeRefTest() throws Exception {
        URL url = new URL("http://example.com#ref with space");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL expectedUrl = new URL("http://example.com#ref%20with%20space");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}