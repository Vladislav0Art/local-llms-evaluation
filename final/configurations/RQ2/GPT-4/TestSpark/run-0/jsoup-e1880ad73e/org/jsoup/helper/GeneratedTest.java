package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorValidUrlTest() throws MalformedURLException {
        URL url = new URL("http://localhost");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        assertNotNull(urlBuilder);
    }

    @Test
    public void UrlBuilderConstructorNullUrlTest() {
        assertThrows(NullPointerException.class, () -> {
            new UrlBuilder(null);
        });
    }

    @Test
    public void buildValidUrlTest() throws MalformedURLException {
        URL url = new URL("http://localhost");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL builtUrl = urlBuilder.build();

        assertNotNull(builtUrl);
        assertEquals("http://localhost", builtUrl.toString());
    }

    @Test
    public void buildEmptyUrlTest() throws MalformedURLException {
        URL url = new URL("");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL builtUrl = urlBuilder.build();

        assertNotNull(builtUrl);
        assertEquals("", builtUrl.toString());
    }

    @Test
    public void appendKeyValValidTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://localhost");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("Key");
        Mockito.when(keyVal.value()).thenReturn("Value");

        urlBuilder.appendKeyVal(keyVal);

        URL builtUrl = urlBuilder.build();
        assertNotNull(builtUrl);
        assertEquals("http://localhost?Key=Value", builtUrl.toString());
    }

    @Test
    public void appendKeyValNullInputTest() throws MalformedURLException {
        URL url = new URL("http://localhost");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        assertThrows(NullPointerException.class, () -> {
            urlBuilder.appendKeyVal(null);
        });
    }

}