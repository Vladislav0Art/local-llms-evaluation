package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class GeneratedTestBuildUrl {

    @Test
    public void testBuildUrl() {
        UrlBuilder builder = new UrlBuilder();
        URL url = builder.build("http://example.com");
        assertEquals("http://example.com", url.toString());
    }

}