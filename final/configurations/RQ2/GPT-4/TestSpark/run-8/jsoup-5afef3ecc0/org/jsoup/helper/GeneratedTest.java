package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.google.com");

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        assertNotNull(urlBuilder);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.google.com");

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL outputUrl = urlBuilder.build();

        assertNotNull(outputUrl);
        assertEquals("http://www.google.com", outputUrl.toString());
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.google.com");
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);

        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value");

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(keyVal);

        URL outputUrl = urlBuilder.build();

        assertNotNull(outputUrl);
        assertEquals("http://www.google.com?key=value", outputUrl.toString());

        verify(keyVal, times(1)).key();
        verify(keyVal, times(1)).value();
    }

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.google.com");
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);

        when(keyVal.key()).thenReturn("a key with @@");
        when(keyVal.value()).thenReturn("a value with $$");

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(keyVal);
    }

}