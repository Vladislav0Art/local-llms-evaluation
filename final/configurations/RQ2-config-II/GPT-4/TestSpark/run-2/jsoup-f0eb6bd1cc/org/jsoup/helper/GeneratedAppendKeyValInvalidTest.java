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

public class GeneratedAppendKeyValInvalidTest {

    @Test
    public void appendKeyValInvalidTest() throws UnsupportedEncodingException {
        URL url = null;
        try {
            url = new URL("http://www.example.com");
        } catch (MalformedURLException e) {
            fail("Invalid URL provided for test");
        }
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("\uD834\uDD1E");
        urlBuilder.appendKeyVal(kv);
    }

}