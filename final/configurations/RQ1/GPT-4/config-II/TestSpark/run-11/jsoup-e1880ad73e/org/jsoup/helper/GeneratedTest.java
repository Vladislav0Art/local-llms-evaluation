package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void buildUrlTest() throws Exception {
        URL inputUrl = new URL("http://username:password@example.com:8080/path?query#ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        assertEquals("http://username:password@example.com:8080/path?query#ref", resultUrl.toString());
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
        when(keyValMock.key()).thenReturn("key");
        when(keyValMock.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyValMock);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://example.com?key=value", resultUrl.toString());
    }

    @Test
    public void buildUrlWithNonAsciiTest() throws Exception {
        URL inputUrl = new URL("http://username:password@exämple.com:8080/päth?qÜery#réf");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://username:password@xn--exmple-4za.com:8080/p%C3%A4th?q%C3%9Cery#r%C3%A9f", resultUrl.toString());
    }

    @Test
    public void appendKeyValWithNonAsciiTest() throws Exception {
        URL inputUrl = new URL("http://exämple.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
        when(keyValMock.key()).thenReturn("këy");
        when(keyValMock.value()).thenReturn("välue");

        urlBuilder.appendKeyVal(keyValMock);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://xn--exmple-4za.com?k%C3%ABy=v%C3%A4lue", resultUrl.toString());
    }

}