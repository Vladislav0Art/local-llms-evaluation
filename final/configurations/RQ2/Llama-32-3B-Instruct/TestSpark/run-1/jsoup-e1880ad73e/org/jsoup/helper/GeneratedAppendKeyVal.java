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

public class GeneratedAppendKeyVal {

    @Test
    public void appendKeyVal() {
        // Arrange
        String baseUrl = "http://example.com";
        String key = "key";
        String value = "value";

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL(baseUrl));
        urlBuilder.appendKeyVal(new Connection.KeyVal(key, value));

        // Assert
        String builtUrl = urlBuilder.build().toString();
        assertTrue(builtUrl.contains("key=value"));
    }

}