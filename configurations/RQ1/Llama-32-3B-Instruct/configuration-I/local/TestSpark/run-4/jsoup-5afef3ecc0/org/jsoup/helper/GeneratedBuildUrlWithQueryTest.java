package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class GeneratedBuildUrlWithQueryTest {

    @Test
    public void buildUrlWithQueryTest() {
        String url = "http://localhost/test?query=abc&ref#123";
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals("http://localhost/test?query=abc&ref#123", builder.build().toString());
    }

}