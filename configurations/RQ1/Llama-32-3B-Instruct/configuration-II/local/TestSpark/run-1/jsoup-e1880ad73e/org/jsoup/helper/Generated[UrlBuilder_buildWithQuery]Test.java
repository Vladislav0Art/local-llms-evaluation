package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class Generated[UrlBuilder_buildWithQuery]

Test {

    @Test
    public void [UrlBuilder_buildWithQuery]Test() {
        String url = "http://example.com/path?query=value";
        String expectedNormUrl = "http://example.com/path?query=value";
        URL expectedU = new URL(expectedNormUrl);
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedU, builder.u);
    }

}