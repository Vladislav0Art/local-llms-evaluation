package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedBuildUrlFromExistingUrl {

    @Test
    public void buildUrlFromExistingUrl() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        URL builtUrl = builder.build();
        assertEquals("http://example.com", builtUrl.toString());
    }

}