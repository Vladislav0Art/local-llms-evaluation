package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Base64;

public class GeneratedBuildUrlWithPunyCoding {

    @Test
    public void buildUrlWithPunyCoding() {
        URL url = new URL("http://a.com");
        UrlBuilder builder = new UrlBuilder(url);
        URI uri = builder.u.getURI();
        assertTrue(uri.getHost().equals("a.com"));
    }

}