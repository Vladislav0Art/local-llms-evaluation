package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private URL mockUrl;

    @Test
    public void buildUrl_withQuery_shouldReturnUrlWithQuery() throws MalformedURLException {
        when(mockUrl.getQuery()).thenReturn("query");
        when(mockUrl.getProtocol()).thenReturn("http");
        when(mockUrl.getUserInfo()).thenReturn("user");
        when(mockUrl.getHost()).thenReturn("host");
        when(mockUrl.getPort()).thenReturn(80);
        when(mockUrl.getPath()).thenReturn("/path");
        when(mockUrl.getRef()).thenReturn("ref");

        UrlBuilder urlBuilder = new UrlBuilder(mockUrl);
        URL builtUrl = urlBuilder.build();

        assertEquals("http://user@host:80/path?query#ref", builtUrl.toString());
    }

}