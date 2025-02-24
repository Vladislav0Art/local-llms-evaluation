package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedBuildWithValidUrlTest {

    private final static String URL_STRING = "http://hostname.com";

    @Test
    public void buildWithValidUrlTest() throws MalformedURLException {
        // Arrange
        URL inputUrl = new URL(URL_STRING);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertNotNull(result);
        assertEquals(URL_STRING, result.toString());
    }

}