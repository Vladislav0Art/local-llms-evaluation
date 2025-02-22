package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.URLEncoder.encode;
import java.net.URLDecoder.decode;
import java.text.Normalizer;
import java.util.Locale;

public class GeneratedTestBuildWithQuery {

    @Test
    public void testBuildWithQuery() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://www.example.com?query=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertEquals(result, inputUrl);
    }

}