package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class GeneratedBuild_SimpleTest {

    public String build() {
        return "http://example.com";
    }

    @Test
    public void build_SimpleTest() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        assertNotNull(urlBuilder.build());
        assertTrue(urlBuilder.build().getProtocol().equals("http"));
        assertTrue(urlBuilder.build().getHost().equals("example.com"));
    }

}