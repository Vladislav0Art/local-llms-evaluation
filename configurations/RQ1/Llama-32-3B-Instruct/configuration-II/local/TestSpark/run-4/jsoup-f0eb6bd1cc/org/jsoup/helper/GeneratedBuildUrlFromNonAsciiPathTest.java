package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildUrlFromNonAsciiPathTest {

    @Test
    public void buildUrlFromNonAsciiPathTest() {
        String inputUrl = "http://test.com/test%20path";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        URI uri = urlBuilder.u.getURI();
        assertTrue(uri.getHost().equals("test.com"));
        assertEquals("%20", uri.getPath());
    }

}