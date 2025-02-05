package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() {
        try {
            URL inputUrl = new URL("http://example.com");
            new UrlBuilder(inputUrl);
        } catch (MalformedURLException e) {
            fail("MalformedURLException is not expected here");
        }
    }

    @Test
    public void UrlBuilderConstructorNullInputTest() {
        new UrlBuilder(null);
    }

    @Test
    public void buildTest() {
        try {
            URL inputUrl = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

            assertNotNull(urlBuilder.build());
        } catch (MalformedURLException e) {
            fail("MalformedURLException is not expected here");
        }
    }

    @Test
    public void appendKeyValTest() {
        try {
            URL inputUrl = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = mock(Connection.KeyVal.class);

            when(kv.key()).thenReturn("key");
            when(kv.value()).thenReturn("value");

            urlBuilder.appendKeyVal(kv);

            assertTrue(urlBuilder.build().getQuery().contains("key=value"));
        } catch (Exception e) {
            fail("Exception is not expected here");
        }
    }

    @Test
    public void appendKeyValEncodingExceptionTest() {
        try {
            URL inputUrl = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = mock(Connection.KeyVal.class);

            when(kv.key()).thenReturn("\uD800\uDC00"); // a surrogate pair
            when(kv.value()).thenReturn("value");

            urlBuilder.appendKeyVal(kv);

        } catch (Exception e) {
            fail("UnsupportedEncodingException is expected here");
        }
    }

}