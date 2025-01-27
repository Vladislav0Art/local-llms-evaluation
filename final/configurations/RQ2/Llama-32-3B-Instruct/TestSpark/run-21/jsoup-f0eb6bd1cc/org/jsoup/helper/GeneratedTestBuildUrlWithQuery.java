package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class GeneratedTestBuildUrlWithQuery {

    @Test
    public void testBuildUrlWithQuery() {
        UrlBuilder builder = new UrlBuilder();
        URL url = builder.build("http://example.com?query=hello");
        assertEquals("http://example.com?query=hello", url.toString());
    }

}