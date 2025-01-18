package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorTest() throws Exception {
        URL testUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        assertNotNull(urlBuilder);
    }

    @Test
    public void urlBuilderConstructorNullTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void buildValidUrlTest() throws Exception {
        URL testUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        URL resultUrl = urlBuilder.build();
        assertNotNull(resultUrl);
        assertEquals("https://www.example.com", resultUrl.toString());
    }

    @Test
    public void buildInvalidUrlTest() throws Exception {
        URL testUrl = new URL("invalidUrl");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL testUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);

        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("key");
        Mockito.when(keyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyVal);

        URL resultUrl = urlBuilder.build();
        assertNotNull(resultUrl);
        assertEquals("https://www.example.com?key=value", resultUrl.toString());
    }

    @Test
    public void appendKeyValInvalidTest() throws Exception {
        URL testUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);

        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("invalidKey");
        Mockito.when(keyVal.value()).thenReturn("invalidValue");

        urlBuilder.appendKeyVal(keyVal);
    }

}