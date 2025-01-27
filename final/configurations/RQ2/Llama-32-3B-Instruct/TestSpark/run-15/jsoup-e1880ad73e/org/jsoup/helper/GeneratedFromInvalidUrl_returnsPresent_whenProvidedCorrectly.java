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

public class GeneratedFromInvalidUrl_returnsPresent_whenProvidedCorrectly {

    @Test
    public void fromInvalidUrl_returnsPresent_whenProvidedCorrectly() {
        assertNotNull(UrlBuilder.fromInvalidUrl("https://example.com").get());
        assertEquals("https://example.com", UrlBuilder.fromInvalidUrl("https://example.com").get());
    }

}