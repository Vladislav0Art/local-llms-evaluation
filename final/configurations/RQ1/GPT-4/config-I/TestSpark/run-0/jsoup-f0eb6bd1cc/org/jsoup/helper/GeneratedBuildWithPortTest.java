package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.Objects;

import static org.junit.Assert.*;

public class GeneratedBuildWithPortTest {

    @Test
    public void buildWithPortTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com:8080"));
        URL url = urlBuilder.build();
        assertTrue(Objects.requireNonNull(url.toString()).endsWith(":8080/"));
    }

}