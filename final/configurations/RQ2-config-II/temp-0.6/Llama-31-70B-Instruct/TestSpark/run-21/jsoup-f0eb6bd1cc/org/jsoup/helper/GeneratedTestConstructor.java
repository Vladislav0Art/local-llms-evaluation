package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedTestConstructor {

    @Test
    public void testConstructor() throws MalformedURLException {
        // Given
        URL url = new URL("http://example.com");

        // When
        UrlBuilder urlBuilder = new UrlBuilder(url);

        // Then
        assertNotNull(urlBuilder.u);
        assertNull(urlBuilder.q);
    }

}