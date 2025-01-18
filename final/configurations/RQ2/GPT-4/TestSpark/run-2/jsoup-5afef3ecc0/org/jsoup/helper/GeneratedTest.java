package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Connection.KeyVal mockKeyVal;

    @Test
    public void UrlBuilderValidUrlTest() throws MalformedURLException {
        new UrlBuilder(new URL("http://google.com"));
    }

    @Test
    public void UrlBuilderNullUrlTest() {
        new UrlBuilder(null);
    }

    @Test
    public void BuildValidUrlTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://google.com"));
        urlBuilder.build();
    }

    @Test
    public void BuildNullUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValUrlTest() throws UnsupportedEncodingException, MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://google.com"));
        when(mockKeyVal.key()).thenReturn("testKey");
        when(mockKeyVal.value()).thenReturn("testVal");
        urlBuilder.appendKeyVal(mockKeyVal);
    }

    @Test
    public void appendKeyValNullKeyTest() throws UnsupportedEncodingException, MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://google.com"));
        when(mockKeyVal.key()).thenReturn(null);
        when(mockKeyVal.value()).thenReturn("testVal");
        urlBuilder.appendKeyVal(mockKeyVal);
    }

    @Test
    public void appendKeyValNullValueTest() throws UnsupportedEncodingException, MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://google.com"));
        when(mockKeyVal.key()).thenReturn("testKey");
        when(mockKeyVal.value()).thenReturn(null);
        urlBuilder.appendKeyVal(mockKeyVal);
    }

}