package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedBuild_WithInvalidInputUrl_ThrowsMalformedURLError {

    @Test
    public void build_WithInvalidInputUrl_ThrowsMalformedURLError() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://example.com/test.html?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL actualUrl = urlBuilder.build();

        // Assert
        assertEquals("http://example.com/test.html?key=value", actualUrl.toString());
    }

}