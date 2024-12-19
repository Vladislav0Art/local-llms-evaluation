package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class Generated[UrlBuilder_getProtocol]

Test {

    @Test
    public void [UrlBuilder_getProtocol]Test() {
        String url = "http://example.com/path?query=value";
        String expectedProtocol = "http";
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedProtocol, builder.u.getProtocol());
    }

}