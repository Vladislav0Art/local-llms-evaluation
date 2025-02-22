package org.jsoup.helper;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestBuild {

    @Test
    public void testBuild() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        // Arrange
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Act
        URL builtUrl = builder.build();

        // Assert
        assertNotNull(builtUrl);
        assertEquals("http://www.example.com", builtUrl.toExternalForm());
    }

}