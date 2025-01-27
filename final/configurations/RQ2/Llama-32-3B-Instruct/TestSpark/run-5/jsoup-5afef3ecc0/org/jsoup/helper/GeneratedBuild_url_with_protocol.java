package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuild_url_with_protocol {

    @Test
    public void build_url_with_protocol() {
        URL url = new URL("http://example.com");
        String expectedUrl = "http://example.com";
        assertEquals(expectedUrl, new UrlBuilder(url).build());
    }

}