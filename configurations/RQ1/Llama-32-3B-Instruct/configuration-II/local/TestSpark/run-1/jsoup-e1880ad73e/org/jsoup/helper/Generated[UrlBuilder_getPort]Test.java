package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class Generated[UrlBuilder_getPort]

Test {

    @Test
    public void [UrlBuilder_getPort]Test() {
        String url = "http://example.com:8080/path?query=value";
        int expectedPort = 8080;
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedPort, builder.u.getPort());
    }

}