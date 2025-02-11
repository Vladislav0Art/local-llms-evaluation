package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.HashMap;

public class GeneratedBuildUrlWithRelativePathTest {

    @Test
    public void buildUrlWithRelativePathTest() {
        URL url = new URL("https://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals("https://example.com", result.getProtocol() + "://" + IDN.toASCII(result.getHost()));
    }

}