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
public class GeneratedBuildUrlWithQuery {

    @Mock
    private URL inputUrl;

    @Test
    public void buildUrlWithQuery() throws MalformedURLException {
        when(inputUrl.getProtocol()).thenReturn("http");
        when(inputUrl.getUserInfo()).thenReturn("user");
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPort()).thenReturn(80);
        when(inputUrl.getPath()).thenReturn("/path");
        when(inputUrl.getQuery()).thenReturn("query=value");
        when(inputUrl.getRef()).thenReturn("fragment");

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();

        assertEquals("http://user@example.com:80/path?query=value#fragment", result.toString());
    }

}