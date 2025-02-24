package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void buildUrlFromConnectionTest() throws MalformedURLException, URISyntaxException {
        Connection connection = mock(Connection.class);
        when(connection.url()).thenReturn(new URL("http://example.com"));
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        URL url = urlBuilder.build();
        Assert.assertEquals("http://example.com", url.toString());
    }

    @Test
    public void buildUrlFromUrlTest() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();
        Assert.assertEquals("http://example.com", url.toString());
    }

}