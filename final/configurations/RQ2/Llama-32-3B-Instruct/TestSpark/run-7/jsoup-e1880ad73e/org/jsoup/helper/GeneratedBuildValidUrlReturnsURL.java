package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildValidUrlReturnsURL {

    @Mock
    private Connection connection;

    @Mock
    private String encodedUrl;

    @Test
    public void buildValidUrlReturnsURL() throws MalformedURLException, URISyntaxException {
        Mockito.when(connection.getUrl()).thenReturn("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        URL result = urlBuilder.build();
        assertEquals("https://example.com", result.toString());
    }

}