package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConstructorsWithEncoding {

    @Test
    public void testConstructorsWithEncoding() {
        String url = "https://www.example.com?encoding=ISO-8859-1&lang=en";
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder);
        assertEquals("https", builder.uri());
        assertTrue(builder.encoding().equals("ISO-8859-1"));
        assertTrue(builder.language().equals("en"));
    }

}