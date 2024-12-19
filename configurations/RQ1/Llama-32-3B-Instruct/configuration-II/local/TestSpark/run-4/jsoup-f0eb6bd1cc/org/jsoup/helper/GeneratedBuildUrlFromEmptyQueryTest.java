package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildUrlFromEmptyQueryTest {

    @Test
    public void buildUrlFromEmptyQueryTest() {
        String inputUrl = "http://test.com";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        URI uri = urlBuilder.u.getURI();
        assertTrue(uri.getHost().equals("test.com"));
    }

}