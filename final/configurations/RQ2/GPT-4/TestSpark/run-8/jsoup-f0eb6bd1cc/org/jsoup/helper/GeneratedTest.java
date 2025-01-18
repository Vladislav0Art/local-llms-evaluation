package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void UrlBuilderValidUrlTest() {
        try {
            URL url = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void UrlBuilderNullUrlTest() {
        URL url = null;
        UrlBuilder urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void buildValidUrlTest() {
        try {
            URL url = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            urlBuilder.build();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void buildInvalidUrlTest() {
        try {
            URL url = new URL("invalid-url");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            urlBuilder.build();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void appendKeyValValidKeyValTest() {
        try {
            URL url = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);

            Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
            when(keyVal.key()).thenReturn("key");
            when(keyVal.value()).thenReturn("value");

            urlBuilder.appendKeyVal(keyVal);
        } catch (UnsupportedEncodingException | MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void appendKeyValUnsupportedEncodingKeyValTest() throws UnsupportedEncodingException {
        try {
            URL url = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);

            Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
            when(keyVal.key()).thenReturn("key\u0019");
            when(keyVal.value()).thenReturn("value\u0019");

            urlBuilder.appendKeyVal(keyVal);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}