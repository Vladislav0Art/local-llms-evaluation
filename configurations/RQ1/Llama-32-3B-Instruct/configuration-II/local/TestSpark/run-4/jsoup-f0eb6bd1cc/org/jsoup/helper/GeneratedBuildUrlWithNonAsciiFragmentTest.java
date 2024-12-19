package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildUrlWithNonAsciiFragmentTest {

    @Test
    public void buildUrlWithNonAsciiFragmentTest() {
        String inputUrl = "http://test.com#non-ascii";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        URI uri = urlBuilder.u.getURI();
        assertTrue(uri.getHost().equals("test.com"));
        assertEquals("%23", uri.getFragment());
    }

}