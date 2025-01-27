package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class GeneratedTestBuildUrlWithPort {

    @Test
    public void testBuildUrlWithPort() {
        UrlBuilder builder = new UrlBuilder();
        URL url = builder.build("http://localhost:8080");
        assertEquals("http://localhost:8080", url.toString());
    }

}