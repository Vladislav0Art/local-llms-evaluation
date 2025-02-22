package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void build_ShouldReturnCorrectUrl() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        // Given
        URL inputUrl = new URL("https://www.example.com/path/to/resource?q=test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // When
        URL resultUrl = urlBuilder.build();

        // Then
        assertEquals("https://www.example.com/path/to/resource?q=test", resultUrl.toString());
    }

    @Test
    public void appendKeyVal_ShouldAppendKeyValue() throws UnsupportedEncodingException {
        // Given
        URL inputUrl = new URL("https://www.example.com/path/to/resource");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String expectedQueryString = "key=value";

        // When
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));

        // Then
        assertEquals(expectedQueryString, urlBuilder.q.toString());
    }

}