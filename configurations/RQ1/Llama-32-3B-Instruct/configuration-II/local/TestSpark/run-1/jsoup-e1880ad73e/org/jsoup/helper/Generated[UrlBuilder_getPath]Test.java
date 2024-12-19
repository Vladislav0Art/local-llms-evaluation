package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class Generated[UrlBuilder_getPath]

Test {

    @Test
    public void [UrlBuilder_getPath]Test() {
        String url = "http://example.com/path?query=value";
        String expectedPath = "/path";
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedPath, builder.decodePart(builder.u.getPath()));
    }

}