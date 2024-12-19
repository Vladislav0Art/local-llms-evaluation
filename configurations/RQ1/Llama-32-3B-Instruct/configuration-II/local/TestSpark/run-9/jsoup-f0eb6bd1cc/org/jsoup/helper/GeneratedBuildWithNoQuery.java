package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildWithNoQuery {

    @Test
    public void buildWithNoQuery() throws URISyntaxException, MalformedURLException {
        URI uri = new URI("http://example.com/path/to/resource");
        String expected = "http://example.com/path%2Fto%2Fresource";
        assertEquals(expected, new UrlBuilder(uri).build().toString());
    }

}