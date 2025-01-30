package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void buildURLWithQueryTest() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://example.com?query=test");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL expectedURL = new URL("http://example.com/?query=test");
        URL actualURL = urlBuilder.build();

        Assert.assertEquals(expectedURL, actualURL);
    }

    @Test
    public void buildInvalidURLTest() throws MalformedURLException, URISyntaxException {
        URL url = new URL("https://:mysite.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    @Test
    public void buildURLWithPunyCodeTest() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://äxample.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL expectedURL = new URL("http://xn--xample-4vae.com/");
        URL actualURL = urlBuilder.build();

        Assert.assertEquals(expectedURL, actualURL);
    }

    @Test
    public void appendKeyValToURLTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com?query=value");
        UrlBuilder urlBuilderSpy = spy(new UrlBuilder(url));
        Connection.KeyVal kvMock = mock(Connection.KeyVal.class);
        urlBuilderSpy.appendKeyVal(kvMock);

        verify(urlBuilderSpy, times(1)).appendKeyVal(kvMock);
    }

}