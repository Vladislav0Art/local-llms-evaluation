package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            assertNotNull(urlBuilder);
        } catch (MalformedURLException e) {
            fail("Test failed due to MalformedURLException.");
        }
    }

    @Test
    public void UrlBuilderConstructorNullInputTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void buildTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            URL builtUrl = urlBuilder.build();
            assertEquals(url, builtUrl);
        } catch (MalformedURLException e) {
            fail("Test failed due to MalformedURLException.");
        }
    }

    @Test
    public void appendKeyValTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(kv.key()).thenReturn("key");
            Mockito.when(kv.value()).thenReturn("value");

            urlBuilder.appendKeyVal(kv);
            URL builtUrl = urlBuilder.build();
            assertTrue(builtUrl.toString().contains("key=value"));
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            fail("Test failed due to MalformedURLException or UnsupportedEncodingException.");
        }
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL url = null;
        try {
            url = new URL("http://example.com");
        } catch (MalformedURLException e) {
            fail("Test failed due to MalformedURLException.");
        }
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("unsupported-encoded-key");
        Mockito.when(kv.value()).thenReturn("value");

        urlBuilder.appendKeyVal(kv);
    }

}