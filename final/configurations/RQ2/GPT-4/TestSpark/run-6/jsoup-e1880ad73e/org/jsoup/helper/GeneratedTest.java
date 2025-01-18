package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorValidUrlTest() {
        URL inputUrl = null;
        try {
            inputUrl = new URL("http://www.google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder);
    }

    @Test
    public void UrlBuilderConstructorNullUrlTest() {
        UrlBuilder builder = new UrlBuilder(null);
    }

    @Test
    public void buildUrlTest() {
        URL inputUrl = null;
        try {
            inputUrl = new URL("http://www.google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertNotNull(result);
        assertEquals("http://www.google.com", result.toString());
    }

    @Test
    public void appendKeyValNullTest() throws UnsupportedEncodingException {
        URL inputUrl = null;
        try {
            inputUrl = new URL("http://www.google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(null);
    }

    @Test
    public void appendKeyValTest() {
        URL inputUrl = null;
        try {
            inputUrl = new URL("http://www.google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("key");
        Mockito.when(kv.value()).thenReturn("value");
        try {
            builder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}