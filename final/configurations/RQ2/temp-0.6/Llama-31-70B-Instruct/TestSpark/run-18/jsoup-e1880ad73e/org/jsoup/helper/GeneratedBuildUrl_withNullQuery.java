package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildUrl_withNullQuery {

    @Mock
    private URL inputUrl;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void buildUrl_withNullQuery() throws Exception {
        // Given
        when(inputUrl.getQuery()).thenReturn(null);
        when(inputUrl.getProtocol()).thenReturn("http");
        when(inputUrl.getUserInfo()).thenReturn("user");
        when(inputUrl.getHost()).thenReturn("host");
        when(inputUrl.getPort()).thenReturn(80);
        when(inputUrl.getPath()).thenReturn("/path");
        when(inputUrl.getRef()).thenReturn("ref");

        // When
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL url = builder.build();

        // Then
        assertEquals("http://user@host:80/path#ref", url.toString());
    }

}