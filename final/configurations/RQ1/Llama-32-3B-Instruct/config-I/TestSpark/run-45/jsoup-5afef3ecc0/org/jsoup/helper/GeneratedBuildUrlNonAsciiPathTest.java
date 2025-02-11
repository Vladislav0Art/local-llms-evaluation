package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildUrlNonAsciiPathTest {

    @Test
    public void buildUrlNonAsciiPathTest() throws MalformedURLException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/àçéèüìòõ/paths?query=value#ref"));
        assertNotNull(builder.u);
        assertEquals("https%3A//example.com/%C3%A0%C3%A7%C3%A6%C3%A9%C3%A7%C3%A9%C3%A8%C3%A9/%C3%A9%C3%A9u%C3%A9i%C3%B1%C3%B2%20paths?query=value#ref", ((URL) builder.u).toString());
    }

}