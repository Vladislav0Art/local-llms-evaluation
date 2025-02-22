package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void buildUrlTest() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        // Given
        URL inputUrl = new URL("http://www.example.com/path?query=value#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // When
        URL builtUrl = urlBuilder.build();

        // Then
        assertEquals("http://www.example.com/path?query=value#fragment", builtUrl.toString());
    }

}