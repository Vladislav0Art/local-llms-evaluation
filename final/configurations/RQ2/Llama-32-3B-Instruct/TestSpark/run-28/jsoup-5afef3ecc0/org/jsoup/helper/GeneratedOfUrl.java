package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedOfUrl {

    @Mock
    private Connection connection;

    public static final String URL = "https://example.com/path?key=value";
    public static final String URL_WITH_QUERY = "https://example.com/path?key=value&foo=bar";

    public static final String URL_WITH
    queryParams ="https://example.com/path?key=value&foo%3Dbar";

    @Test
    public void ofUrl() {
        UrlBuilder builder = new UrlBuilder(new URL(URL));
        assertEquals(URL, builder.build().toString());
    }

}