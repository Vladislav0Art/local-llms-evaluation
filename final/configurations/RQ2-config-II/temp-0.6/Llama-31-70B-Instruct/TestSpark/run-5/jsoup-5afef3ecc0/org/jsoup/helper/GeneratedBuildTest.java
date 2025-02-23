package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTest {

    @Mock
    private URL mockURL;

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(mockURL);
    }

    @Test
    public void buildTest() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        when(mockURL.getProtocol()).thenReturn("http");
        when(mockURL.getUserInfo()).thenReturn("user");
        when(mockURL.getHost()).thenReturn("example.com");
        when(mockURL.getPort()).thenReturn(80);
        when(mockURL.getPath()).thenReturn("/path");
        when(mockURL.getRef()).thenReturn("ref");

        URL builtUrl = urlBuilder.build();

        assertEquals("http://user@example.com:80/path#ref", builtUrl.toString());
    }

}