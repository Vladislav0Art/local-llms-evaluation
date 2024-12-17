package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedBuildUrlWithNonAsciiPath {

    @Test
    public void buildUrlWithNonAsciiPath() {
        URL u = new URL("http://example.com/äoth?key=value&space+as+plus#anchor");
        UrlBuilder builder = new UrlBuilder(u);
        builder.build();
        URI uri = u.getURI();
        assertEquals("äoth", uri.getPath());
    }

}