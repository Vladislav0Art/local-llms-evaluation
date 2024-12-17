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

public class GeneratedBuildNormalUrl {

    @Test
    public void buildNormalUrl() {
        URL url = new URL("http://a.com?b=1#c");
        UrlBuilder builder = new UrlBuilder(url);
        URI uri = builder.u.getURI();
        assertTrue(uri.getScheme().equals("http"));
        assertEquals("a.com", uri.getHost());
        assertEquals(null, uri.getUserInfo());
        assertEquals(80, uri.getPort());
    }

}