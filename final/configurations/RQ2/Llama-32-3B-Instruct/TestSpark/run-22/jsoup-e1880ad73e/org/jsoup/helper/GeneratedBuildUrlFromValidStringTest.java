package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.IDN;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildUrlFromValidStringTest {

    @Test
    public void buildUrlFromValidStringTest() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?param=value";
        URL expectedUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(expectedUrl.toURI().toString());
        assertEquals(expectedUrl, builder.build());
    }

}