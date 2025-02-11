package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

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

public class GeneratedDecodePart_withEncodedString_ReturnsDecodedString {

    @Test
    public void decodePart_withEncodedString_ReturnsDecodedString() {
        String encoded = "http%3A%2F%2Fexample.com";
        assertEquals("http://example.com", UrlBuilder.decodePart(encoded));
    }

}