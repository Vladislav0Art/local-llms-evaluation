package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedShouldBuildURL {

    private UrlBuilder urlBuilder;
    @Mock
    private URL mockUrl;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        urlBuilder = new UrlBuilder(mockUrl);
    }

    @Test
    public void shouldBuildURL() {
        when(mockUrl.getProtocol()).thenReturn("https");
        when(mockUrl.getUserInfo()).thenReturn("user");
        when(mockUrl.getHost()).thenReturn("www.example.com");
        when(mockUrl.getPort()).thenReturn(443);
        when(mockUrl.getPath()).thenReturn("/path");
        when(mockUrl.getQuery()).thenReturn("query=value");
        when(mockUrl.getRef()).thenReturn("fragment");

        URL expectedUrl = new URL("https://user@www.example.com:443/path?query=value#fragment");
        URL actualUrl = urlBuilder.build();

        assertEquals(expectedUrl, actualUrl);
    }

}