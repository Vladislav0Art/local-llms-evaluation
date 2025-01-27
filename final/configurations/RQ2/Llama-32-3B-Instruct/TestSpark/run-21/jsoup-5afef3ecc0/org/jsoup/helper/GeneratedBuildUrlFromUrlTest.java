package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.net.MalformedURLException;

public class GeneratedBuildUrlFromUrlTest {

    @Test
    public void buildUrlFromUrlTest() {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        URL url = builder.build();
        assertEquals("http://example.com", url.toString());
    }

}