package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTest {

    @Mock
    private URL url;

    @Test
    public void buildTest() throws MalformedURLException {
        when(url.getProtocol()).thenReturn("http");
        when(url.getHost()).thenReturn("www.example.com");
        when(url.getPath()).thenReturn("/path");

        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();

        assertEquals("http://www.example.com/path", builtUrl.toString());
    }

}