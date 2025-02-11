package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendToAsciiWithNonASCII_BUILDSURL {

    @Test
    public void appendToAsciiWithNonASCII_BUILDSURL() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?query=withéspaces&another+key=anothervalu";
        URL parsedUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(parsedUrl);
        assertEquals("http://example.com/path%3Fquery%3Dwith%C3%A9spaces%26another%2Bkey%3Danothervalu", (builder.u.getQuery() != null ? builder.u.getQuery().toString() : "").replaceAll("/$", ""));
    }

}