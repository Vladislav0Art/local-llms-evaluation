package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedBuildUrlWithoutQuery {

    @Mock
    private URL mockURL;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void buildUrlWithoutQuery() throws MalformedURLException {
        when(mockURL.getProtocol()).thenReturn("http");
        when(mockURL.getHost()).thenReturn("www.example.com");
        when(mockURL.getPath()).thenReturn("/some/path");
        when(mockURL.getPort()).thenReturn(-1);
        when(mockURL.getUserInfo()).thenReturn(null);

        UrlBuilder urlBuilder = new UrlBuilder(mockURL);

        URL url = urlBuilder.build();

        assertEquals("http://www.example.com/some/path", url.toString());
    }

}