package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.mockito.Mockito.*;

public class GeneratedNewUrlBuilder_fromValidUrl {

    @Test
    public void newUrlBuilder_fromValidUrl() {
        assertDoesNotThrow(() -> UrlBuilder.fromValidUrl(new URL("https://example.com")).isPresent());
        assertNotNull(UrlBuilder.fromValidUrl(new URL("https://example.com")).get());
        assertEquals("https://example.com", UrlBuilder.fromValidUrl(new URL("https://example.com")).get());
    }

}