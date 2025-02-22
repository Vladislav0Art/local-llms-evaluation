package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrlWithQuery {

    @Mock
    private URL inputUrl;

    @Test
    public void buildUrlWithQuery() throws MalformedURLException, URISyntaxException {
        when(inputUrl.getProtocol()).thenReturn("https");
        when(inputUrl.getHost()).thenReturn("www.example.com");
        when(inputUrl.getPort()).thenReturn(443);
        when(inputUrl.getPath()).thenReturn("/path");
        when(inputUrl.getQuery()).thenReturn("key1=val1&key2=val2");
        when(inputUrl.getRef()).thenReturn("ref");

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();

        assertEquals("https://www.example.com:443/path?key1=val1&key2=val2#ref", outputUrl.toExternalForm());
    }

}