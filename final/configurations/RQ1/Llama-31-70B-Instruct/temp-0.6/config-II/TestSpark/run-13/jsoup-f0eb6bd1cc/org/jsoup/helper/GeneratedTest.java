package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void buildUrlTest() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        // Arrange
        URL inputUrl = new URL("https://www.example.com/test?q=search");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL actualUrl = urlBuilder.build();

        // Assert
        assertEquals("https://www.example.com/test?q=search", actualUrl.toString());
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        // Arrange
        URL inputUrl = new URL("https://www.example.com/test?q=search");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal kv = new Connection.KeyVal("key", "value");

        // Act
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertEquals("key=value", urlBuilder.q.toString());
    }

    @Test
    public void decodePartTest() {
        // Arrange
        String encoded = "url%20encoded";

        // Act
        String actual = UrlBuilder.decodePart(encoded);

        // Assert
        assertEquals("url encoded", actual);
    }

}