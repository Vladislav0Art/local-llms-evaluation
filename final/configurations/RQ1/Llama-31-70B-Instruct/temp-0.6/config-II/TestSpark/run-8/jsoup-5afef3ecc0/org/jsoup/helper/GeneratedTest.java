package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private URL mockedUrl;

    @Test
    public void buildUrlWithNullHost() {
        when(mockedUrl.getHost()).thenReturn(null);
        UrlBuilder urlBuilder = new UrlBuilder(mockedUrl);
        URL url = urlBuilder.build();
        assertNull(url.getHost());
    }

    @Test
    public void buildUrlWithHost() {
        when(mockedUrl.getHost()).thenReturn("example.com");
        UrlBuilder urlBuilder = new UrlBuilder(mockedUrl);
        URL url = urlBuilder.build();
        assertEquals("example.com", url.getHost());
    }

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        when(mockedUrl.getHost()).thenReturn("example.com");
        UrlBuilder urlBuilder = new UrlBuilder(mockedUrl);
        urlBuilder.appendKeyVal("key", "value");
        URL url = urlBuilder.build();
        assertEquals("key=value", url.getQuery());
    }

}