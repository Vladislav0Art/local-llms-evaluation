package org.jsoup.helper;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;

public class GeneratedTest {

    @Test
    public void buildUrlUrlIsNullTest() {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(null);

        // Act
        URL url = urlBuilder.build();

        // Assert
        assertEquals(null, url);
    }

    @Test
    public void buildUrlUrlIsEmptyTest() {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder("");

        // Act
        URL url = urlBuilder.build();

        // Assert
        assertEquals(null, url);
    }

    @Test
    public void buildUrlUrlIsInvalidTest() {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder("invalid_url");

        // Act
        URL url = urlBuilder.build();

        // Assert
        assertEquals(null, url);
    }

}