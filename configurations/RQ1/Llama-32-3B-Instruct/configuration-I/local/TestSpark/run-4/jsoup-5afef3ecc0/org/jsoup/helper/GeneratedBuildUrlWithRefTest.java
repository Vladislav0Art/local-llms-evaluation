package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class GeneratedBuildUrlWithRefTest {

    @Test
    public void buildUrlWithRefTest() {
        String url = "http://localhost/test#123";
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals("http://localhost/test#123", builder.build().toString());
    }

}