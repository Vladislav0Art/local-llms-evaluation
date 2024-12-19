package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class Generated[UrlBuilder_getHost]

Test {

    @Test
    public void [UrlBuilder_getHost]Test() {
        String url = "http://example.com/path?query=value";
        String expectedHost = "example.com";
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedHost, builder.decodePart(builder.u.getHost()));
    }

}