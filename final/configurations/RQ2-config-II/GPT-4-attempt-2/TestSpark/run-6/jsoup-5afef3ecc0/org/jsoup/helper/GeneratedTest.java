package org.jsoup.helper;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull("UrlBuilder instance should be created", builder);
    }

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://test.url");
        UrlBuilder builder = new UrlBuilder(url);
        URL buildUrl = builder.build();
        assertEquals("Built url should match the input url", url, buildUrl);
    }

    @Test
    public void buildInvalidUrlTest() throws Exception {
        URL url = new URL("http://");
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL url = new URL("http://test.url");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal mockKeyVal = mock(Connection.KeyVal.class);
        when(mockKeyVal.key()).thenReturn("key");
        when(mockKeyVal.value()).thenReturn("value");
        builder.appendKeyVal(mockKeyVal);
        URL buildUrl = builder.build();
        assertTrue("Url should contain appended key-value pair",
                buildUrl.getQuery().contains("key=value"));
    }

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws UnsupportedEncodingException {
        URL url = new URL("http://test.url");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal mockKeyVal = mock(Connection.KeyVal.class);
        when(mockKeyVal.key()).thenReturn("未");
        when(mockKeyVal.value()).thenReturn("支持");
        builder.appendKeyVal(mockKeyVal);
    }

}