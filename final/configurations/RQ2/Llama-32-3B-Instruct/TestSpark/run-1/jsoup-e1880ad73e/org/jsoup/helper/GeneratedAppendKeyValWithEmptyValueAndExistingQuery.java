package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValWithEmptyValueAndExistingQuery {

    @Test
    public void appendKeyValWithEmptyValueAndExistingQuery() {
        // Arrange
        String baseUrl = "http://example.com";
        String key1 = "key1";
        String value1 = "value1";
        String key2 = "key2";
        String value2 = "";

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL(baseUrl));
        urlBuilder.appendKeyVal(new Connection.KeyVal(key1, value1));
        urlBuilder.appendKeyVal(new Connection.KeyVal(key2, value2));

        // Assert
        String builtUrl = urlBuilder.build().toString();
        assertTrue(builtUrl.contains("key1=value1"));
        assertTrue(builtUrl.contains("key2="));
    }

}