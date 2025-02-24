package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.*;

public class GeneratedBuild_NullUrl_NullResult {

    @Test
    public void build_NullUrl_NullResult() throws MalformedURLException, UnsupportedEncodingException {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(null);

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertNull(result);
    }

}