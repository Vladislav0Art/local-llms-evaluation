package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedTest {

    @Mock
    private URL inputUrl;

    @Test
    public void build_withValidInputUrl_shouldReturnNormalizedUrl() throws MalformedURLException {
        URL expectedUrl = new URL("http://www.example.com");
        Mockito.when(inputUrl.getProtocol()).thenReturn("http");
        Mockito.when(inputUrl.getHost()).thenReturn("www.example.com");
        Mockito.when(inputUrl.getPath()).thenReturn("");
        Mockito.when(inputUrl.getQuery()).thenReturn(null);
        Mockito.when(inputUrl.getRef()).thenReturn(null);

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL normalizedUrl = urlBuilder.build();

        assertEquals(expectedUrl.toString(), normalizedUrl.toString());
    }

    @Test
    public void build_withNullInputUrl_shouldReturnNull() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        URL normalizedUrl = urlBuilder.build();

        assertNull(normalizedUrl);
    }

    @Test
    public void build_withNullInputHost_shouldReturnNull() throws MalformedURLException {
        Mockito.when(inputUrl.getHost()).thenReturn(null);

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL normalizedUrl = urlBuilder.build();

        assertNull(normalizedUrl);
    }

}