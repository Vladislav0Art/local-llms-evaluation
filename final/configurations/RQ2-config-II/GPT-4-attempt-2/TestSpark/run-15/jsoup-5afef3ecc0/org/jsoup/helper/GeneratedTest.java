package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder);
    }

    @Test
    public void UrlBuilderConstructorNullUrlTest() {
        UrlBuilder builder = new UrlBuilder(null);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL outputUrl = builder.build();
        assertNotNull(outputUrl);
    }

    @Test
    public void buildInvalidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("ht:/example");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.build();
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal mockedKeyVal = mock(Connection.KeyVal.class);
        Mockito.when(mockedKeyVal.key()).thenReturn("testKey");
        Mockito.when(mockedKeyVal.value()).thenReturn("testValue");
        builder.appendKeyVal(mockedKeyVal);
        URL outputUrl = builder.build();
        assertNotNull(outputUrl);
    }

    @Test
    public void appendKeyValInvalidEncodingTest() throws UnsupportedEncodingException, MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal mockedKeyVal = mock(Connection.KeyVal.class);
        Mockito.when(mockedKeyVal.key()).thenReturn("testKey");
        Mockito.when(mockedKeyVal.value()).thenReturn("\u0080");
        builder.appendKeyVal(mockedKeyVal);
    }

}