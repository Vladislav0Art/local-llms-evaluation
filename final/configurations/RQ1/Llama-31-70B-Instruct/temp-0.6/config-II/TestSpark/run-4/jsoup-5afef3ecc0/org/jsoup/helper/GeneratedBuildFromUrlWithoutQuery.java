package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildFromUrlWithoutQuery {

    @Mock
    URL mockUrl;

    @Test
    public void buildFromUrlWithoutQuery() throws URISyntaxException {
        when(mockUrl.getProtocol()).thenReturn("https");
        when(mockUrl.getHost()).thenReturn("www.example.com");
        when(mockUrl.getPath()).thenReturn("/path/to/resource");
        when(mockUrl.getPort()).thenReturn(443);

        UrlBuilder urlBuilder = new UrlBuilder(mockUrl);
        URL builtUrl = urlBuilder.build();

        assertEquals("https://www.example.com:443/path/to/resource", builtUrl.toString());
    }

}