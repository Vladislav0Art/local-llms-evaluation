package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildWithNonAsciiPath {

    @Test
    public void buildWithNonAsciiPath() throws URISyntaxException, MalformedURLException {
        URI uri = new URI("http://example.com/äöü/path/to/resource");
        String expected = "http://example.com/%C3%A6%C3%B6%C3%BC/path%2Fto%2Fresource";
        assertEquals(expected, new UrlBuilder(uri).build().toString());
    }

}