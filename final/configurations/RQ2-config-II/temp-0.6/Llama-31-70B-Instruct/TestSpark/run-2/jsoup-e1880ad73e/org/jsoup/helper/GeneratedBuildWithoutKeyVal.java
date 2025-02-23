package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWithoutKeyVal {

    @Mock
    URL inputUrl;

    UrlBuilder urlBuilder;

    @Before
    public void setUp() throws MalformedURLException {
        when(inputUrl.getProtocol()).thenReturn("https");
        when(inputUrl.getHost()).thenReturn("www.example.com");
        when(inputUrl.getPath()).thenReturn("/test/url");
        when(inputUrl.getQuery()).thenReturn("query=true");
        when(inputUrl.getRef()).thenReturn("fragment");

        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void buildWithoutKeyVal() throws UnsupportedEncodingException {
        URL url = urlBuilder.build();

        assertEquals("https://www.xn--example-hva.com/test/url?query=true#fragment", url.toExternalForm());
    }

}