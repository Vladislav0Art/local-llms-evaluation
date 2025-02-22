package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValTest {

    private static final String TEST_URL = "http://localhost:8080/test?q=abc";

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        // Arrange
        String expectedQuery = "q=abc&key1=value1&key2=value2";

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL(TEST_URL));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key2", "value2"));
        String actualQuery = urlBuilder.q.toString();

        // Assert
        assertEquals(expectedQuery, actualQuery);
    }

}