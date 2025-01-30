package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorInputUrlNotNullTest() throws MalformedURLException {
        URL url = new URL("http://jsoup.org");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder.u);
    }

    @Test
    public void buildURLTest() throws MalformedURLException {
        URL url = new URL("http://jsoup.org");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        assertNotNull(builtUrl);
        assertEquals(url.toString(), builtUrl.toString());
    }

    @Test
    public void buildURLWithQueryTest() throws MalformedURLException {
        URL url = new URL("http://jsoup.org?query=test");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        assertNotNull(builtUrl);
        assertEquals(url.toString(), builtUrl.toString());
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://jsoup.org");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("key");
        Mockito.when(kv.value()).thenReturn("value");
        urlBuilder.appendKeyVal(kv);
        assertNotNull(urlBuilder.q);
        assertEquals("key=value", urlBuilder.q.toString());
    }

}