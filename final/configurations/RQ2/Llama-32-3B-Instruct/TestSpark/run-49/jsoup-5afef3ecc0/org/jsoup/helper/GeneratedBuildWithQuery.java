package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWithQuery {

    @Mock
    private Connection connection;

    @Test
    public void buildWithQuery() throws URISyntaxException, UnsupportedEncodingException {
        when(connection.getScheme()).thenReturn("http");
        when(connection.getHost()).thenReturn("example.com");
        when(connection.getPort()).thenReturn(80);
        assertEquals("http://example.com?query=value", UrlBuilder.build(connection));
    }

}