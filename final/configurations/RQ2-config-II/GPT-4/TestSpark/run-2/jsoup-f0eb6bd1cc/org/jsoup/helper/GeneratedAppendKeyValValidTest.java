package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValValidTest {

    @Test
    public void appendKeyValValidTest() throws UnsupportedEncodingException {
        URL url = null;
        try {
            url = new URL("http://www.example.com");
        } catch (MalformedURLException e) {
            fail("Invalid URL provided for test");
        }
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("key");
        when(kv.value()).thenReturn("value");
        try {
            urlBuilder.appendKeyVal(kv);
            URL resultURL = urlBuilder.build();
            assertEquals(url + "?key=value", resultURL.toString());
        } catch (UnsupportedEncodingException e) {
            fail("Exception thrown during test: " + e.toString());
        }
    }

}