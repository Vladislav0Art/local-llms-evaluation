package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private URL inputUrl;

    @Test
    public void buildUrlFromEmptyConnectionTest() throws MalformedURLException {
        when(inputUrl.toString()).thenReturn("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder.build());
    }

    @Test
    public void buildUrlWithQueryFromEmptyConnectionTest() throws MalformedURLException {
        when(inputUrl.toString()).thenReturn("http://example.com?query=values");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder.build());
    }

    @Test
    public void appendKeyValAndGetKeyValTest() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        assertEquals(key, kv.getKey());
        assertEquals(value, kv.getValue());
    }

    @Test
    public void appendKeyValAndGetKeyValWithNullValueTest() throws UnsupportedEncodingException {
        String key = "key";
        String value = null;
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        assertEquals(key, kv.getKey());
        assertNull(kv.getValue());
    }

    @Test
    public void appendKeyValAndGetKeyValWithEmptyValueTest() throws UnsupportedEncodingException {
        String key = "key";
        String value = "";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        assertEquals(key, kv.getKey());
        assertEquals("", kv.getValue());
    }

    @Test
    public void appendKeyValAndGetKeyValWithNullKeyTest() throws UnsupportedEncodingException {
        String key = null;
        String value = "value";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        assertNull(kv.getKey());
        assertEquals(value, kv.getValue());
    }

    @Test
    public void appendKeyValAndGetKeyValWithNullValueTest() throws UnsupportedEncodingException {
        String key = "key";
        String value = null;
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        assertEquals(key, kv.getKey());
        assertNull(kv.getValue());
    }

    @Test
    public void appendKeyValAndGetKeyValWithEmptyKeyTest() throws UnsupportedEncodingException {
        String key = "";
        String value = "value";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        assertEquals("", kv.getKey());
        assertEquals(value, kv.getValue());
    }

    @Test
    public void appendKeyValAndGetKeyValWithEmptyValueAndNullKeyTest() throws UnsupportedEncodingException {
        String key = "";
        String value = "";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        assertNull(kv.getKey());
        assertNull(kv.getValue());
    }

}