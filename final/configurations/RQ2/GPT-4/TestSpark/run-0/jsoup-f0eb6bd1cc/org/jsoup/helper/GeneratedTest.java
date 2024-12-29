package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void UrlBuilder_WithValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(urlBuilder.build(), inputUrl);
    }

    @Test
    public void UrlBuilder_WithNullUrlTest() throws MalformedURLException {
        URL inputUrl = null;
        new UrlBuilder(inputUrl);
    }

    @Test
    public void build_WithNoAdditionalParametersTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(urlBuilder.build(), inputUrl);
    }

    @Test
    public void appendKeyVal_ValidKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL inputUrl = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("param");
        Mockito.when(keyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyVal);

        URL expectedUrl = new URL("https://www.google.com?param=value");
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void appendKeyVal_InvalidKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL inputUrl = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("param");
        Mockito.when(keyVal.value()).thenReturn("%");

        urlBuilder.appendKeyVal(keyVal);
    }

}