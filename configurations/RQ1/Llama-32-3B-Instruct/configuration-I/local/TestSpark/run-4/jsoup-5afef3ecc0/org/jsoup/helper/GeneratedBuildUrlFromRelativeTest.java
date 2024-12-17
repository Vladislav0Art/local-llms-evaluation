package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class GeneratedBuildUrlFromRelativeTest {

    @Test
    public void buildUrlFromRelativeTest() {
        String url = "http://localhost/test";
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(url, builder.build().toString());
    }

}