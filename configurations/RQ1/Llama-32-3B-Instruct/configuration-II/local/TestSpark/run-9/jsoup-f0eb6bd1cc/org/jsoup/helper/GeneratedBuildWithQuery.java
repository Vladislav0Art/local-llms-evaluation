package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildWithQuery {

    @Test
    public void buildWithQuery() throws URISyntaxException, MalformedURLException {
        URI uri = new URI("http://example.com/path/to/resource?query=parameter");
        String expected = "http://example.com/path%2Fto%2Fresource?query=parameter";
        assertEquals(expected, new UrlBuilder(uri).build().toString());
    }

}