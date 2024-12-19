package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildUrlWithNonAsciiPathAndQueryTest {

    @Test
    public void buildUrlWithNonAsciiPathAndQueryTest() {
        String inputUrl = "http://test.com/test%20path?query=non-ascii";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        URI uri = urlBuilder.u.getURI();
        assertTrue(uri.getHost().equals("test.com"));
        assertEquals("%20", uri.getPath());
        assertEquals("?query=%3C%C9%C8%97%C4%B7", uri.getQuery());
    }

}