package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void appendKeyVal_test() {
        String key = "test_key";
        String value = "test_value";

        Mockito.mock(Connection.class);
        UrlBuilder urlBuilder = new UrlBuilder(Mockito.mock(URL.class));
        urlBuilder.appendKeyVal(new org.jsoup.KeyVal(key, value));
        Mockito.verify(urlBuilder).appendKeyVal(Mockito.any(org.jsoup.KeyVal.class));
    }

    @Test
    public void build_test() {
        String inputUrl = "https://example.com";
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
        URI uri = result.toURI();
        assertTrue(uri.getScheme().equals("https"));
        assertTrue(uri.getHost().contains("example.com"));
    }

    @Test
    public void build_test2() {
        String inputUrl = "https://example.com:80";
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
        URI uri = result.toURI();
        assertTrue(uri.getScheme().equals("https"));
        assertTrue(uri.getHost().contains("example.com"));
        assertTrue(uri.getPort() == 80);
    }

    @Test
    public void build_test3() {
        String inputUrl = "https://example.com:8080";
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
        URI uri = result.toURI();
        assertTrue(uri.getScheme().equals("https"));
        assertTrue(uri.getHost().contains("example.com"));
        assertTrue(uri.getPort() == 8080);
    }

    @Test
    public void appendKeyVal_test() {
        String key = "test_key";
        String value = "test_value";

        Mockito.mock(Connection.class);
        UrlBuilder urlBuilder = new UrlBuilder(Mockito.mock(URL.class));
        org.jsoup.KeyVal kv = new org.jsoup.KeyVal(key, value);
        urlBuilder.appendKeyVal(kv);
        Mockito.verify(urlBuilder).appendKeyVal(Mockito.any(org.jsoup.KeyVal.class));
    }

}