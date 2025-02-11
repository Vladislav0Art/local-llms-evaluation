package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.HashMap;

public class GeneratedBuildUrlWithAbsolutePathTest {

    @Test
    public void buildUrlWithAbsolutePathTest() {
        URL url = new URL("https://example.com/path?query=foo&bar=1");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals("https://example.com/path", result.getProtocol() + "://" + IDN.toASCII(result.getHost()));
    }

}