package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_Builds_Url_With_Encoded_Uri {

    @Mock
    private URL url;
    @Mock
    private Connection.KeyVal keyVal;
    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void build_Builds_Url_With_Encoded_Uri() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        // Arrange
        Mockito.when(url.getProtocol()).thenReturn("http");
        Mockito.when(url.getUserInfo()).thenReturn("test");
        Mockito.when(url.getHost()).thenReturn("test.com");
        Mockito.when(url.getPort()).thenReturn(80);
        Mockito.when(url.getPath()).thenReturn("/test");

        // Act
        URL result = urlBuilder.build();

        // Assert
        String expected = "http://test@xn--test-com-v5b.com:80/test";
        assertEquals(expected, result.toString());
    }

}