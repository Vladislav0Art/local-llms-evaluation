package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private URL validUrl;

    @Mock
    private Connection.KeyVal keyVal;

    @Test
    public void UrlBuilderNullArgumentTest() throws MalformedURLException {
        new UrlBuilder(null);
    }

    @Test
    public void UrlBuilderValidUrlTest() throws MalformedURLException {
        validUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(validUrl);
    }

    @Test
    public void appendKeyValNullArgumentTest() throws MalformedURLException, UnsupportedEncodingException {
        validUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(validUrl);
        urlBuilder.appendKeyVal(null);
    }

    @Test
    public void appendKeyValValidArgumentTest() throws MalformedURLException, UnsupportedEncodingException {
        validUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(validUrl);
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value");
        urlBuilder.appendKeyVal(keyVal);
    }

    @Test
    public void buildWithoutUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.build();
    }

    @Test
    public void buildWithValidUrlTest() throws MalformedURLException {
        validUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(validUrl);
        urlBuilder.build();
    }

}