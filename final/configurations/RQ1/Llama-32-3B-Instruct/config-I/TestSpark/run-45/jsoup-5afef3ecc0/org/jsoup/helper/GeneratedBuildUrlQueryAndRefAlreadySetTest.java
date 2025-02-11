package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildUrlQueryAndRefAlreadySetTest {

    @Test
    public void buildUrlQueryAndRefAlreadySetTest() throws MalformedURLException {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        assertNotNull(builder.q);
        assertNotNull(builder.u);
        assertEquals("https%3A//example.com/path?query=value#ref", ((URL) builder.u).toString());
    }

}