package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class GeneratedTestBuildUrlWithProtocolAndPort {

    @Test
    public void testBuildUrlWithProtocolAndPort() {
        UrlBuilder builder = new UrlBuilder();
        URL url = builder.build("https://example.com:8443");
        assertEquals("https://example.com:8443", url.toString());
    }

}