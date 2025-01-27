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
public class GeneratedBuild_ReturnsDefaultUrl {

    @Mock
    private Connection connection;

    @Test
    public void build_ReturnsDefaultUrl() {
        // Arrange
        Mockito.when(connection.getScheme()).thenReturn("https");
        Mockito.when(connection.getHost()).thenReturn("example.com");

        // Act
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        URL result = builder.build();

        // Assert
        assert result.getProtocol().equals("https");
        assert result.getHost().equals("example.com");
    }

}