package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildUrlPunyCodingHostTest {

    @Test
    public void buildUrlPunyCodingHostTest() throws MalformedURLException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com:8080/path?query=value#ref"));
        assertNotNull(builder.u);
        assertEquals("https%3A//example.com:8080/path?query=value#ref", ((URL) builder.u).toString());
    }

}