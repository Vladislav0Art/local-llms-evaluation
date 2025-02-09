package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void UrlBuilderValidUrlTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder);
    }

    @Test
    public void UrlBuilderNullUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void buildValidTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();
        assertEquals(url, resultUrl);
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Jsoup.connect(url.toString()).data("key", "value").request().data().get(0);
        urlBuilder.appendKeyVal(keyVal);
        URL resultUrl = urlBuilder.build();
        assertTrue(resultUrl.toString().contains("key=value"));
    }

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Jsoup.connect(url.toString()).data("key", "\uDEAD").request().data().get(0);
        urlBuilder.appendKeyVal(keyVal);
    }

}