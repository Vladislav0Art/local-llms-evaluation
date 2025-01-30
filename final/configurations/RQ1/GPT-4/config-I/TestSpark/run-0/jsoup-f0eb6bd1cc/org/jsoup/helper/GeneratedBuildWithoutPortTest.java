package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.Objects;

import static org.junit.Assert.*;

public class GeneratedBuildWithoutPortTest {

    @Test
    public void buildWithoutPortTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        URL url = urlBuilder.build();
        assertTrue(Objects.requireNonNull(url.toString()).endsWith("/"));
    }

}