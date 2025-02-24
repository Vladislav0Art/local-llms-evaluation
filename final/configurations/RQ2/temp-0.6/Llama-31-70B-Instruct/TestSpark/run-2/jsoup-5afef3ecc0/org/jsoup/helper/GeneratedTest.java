package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedTest {

    @Test
    public void buildTest() throws MalformedURLException, URISyntaxException {
        // Arrange
        URL inputUrl = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertEquals(URI.create("http://www.example.com/"), result.toURI());
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        // Arrange
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        UrlBuilder urlBuilder = new UrlBuilder(null);

        // Act
        urlBuilder.appendKeyVal(kv);

        // Assert
        // No assertions as the method has no return value and no side effects.
    }

}