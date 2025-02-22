package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlTest {

    private static final String TEST_URL = "http://localhost:8080/test?q=abc";

    @Test
    public void buildUrlTest() throws MalformedURLException, UnsupportedEncodingException {
        // Arrange
        URL inputUrl = new URL(TEST_URL);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String expectedUrl = "http://localhost:8080/test?q=abc";

        // Act
        URL actualUrl = urlBuilder.build();

        // Assert
        assertEquals(expectedUrl, actualUrl.toString());
    }

}