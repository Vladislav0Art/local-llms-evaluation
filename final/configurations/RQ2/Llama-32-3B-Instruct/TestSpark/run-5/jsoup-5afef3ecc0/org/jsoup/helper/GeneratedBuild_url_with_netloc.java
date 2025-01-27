package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuild_url_with_netloc {

    @Test
    public void build_url_with_netloc() throws MalformedURLException {
        URL url = new URL("http://example.com/path/to/resource?query=value#fragment");
        String expectedUrl = "http://example.com/path/to/resource?query=value#fragment";
        assertEquals(expectedUrl, new UrlBuilder(url).build());
    }

}