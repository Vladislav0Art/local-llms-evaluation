package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private URL url;

    @Test
    public void buildTest() {
        when(url.getProtocol()).thenReturn("http");
        when(url.getUserInfo()).thenReturn("user");
        when(url.getHost()).thenReturn("example.com");
        when(url.getPort()).thenReturn(80);
        when(url.getPath()).thenReturn("/path");
        when(url.getRef()).thenReturn("ref");

        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();

        assertEquals("http://user@example.com:80/path#ref", result.toString());
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        when(url.getQuery()).thenReturn("key=value");

        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key2", "value2"));

        assertEquals("key=value&key2=value2", urlBuilder.q.toString());
    }

}