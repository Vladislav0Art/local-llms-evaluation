package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class GeneratedDecodePartTest {

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