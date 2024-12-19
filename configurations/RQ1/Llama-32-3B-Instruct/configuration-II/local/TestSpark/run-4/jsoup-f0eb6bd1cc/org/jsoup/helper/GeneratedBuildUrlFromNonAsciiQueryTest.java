package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildUrlFromNonAsciiQueryTest {

    @Test
    public void buildUrlFromNonAsciiQueryTest() {
        String inputUrl = "http://test.com?query=non-ascii";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        URI uri = urlBuilder.u.getURI();
        assertTrue(uri.getHost().equals("test.com"));
        assertEquals("?query=%3C%C9%C8%97%C4%B7", uri.getQuery());
    }

}