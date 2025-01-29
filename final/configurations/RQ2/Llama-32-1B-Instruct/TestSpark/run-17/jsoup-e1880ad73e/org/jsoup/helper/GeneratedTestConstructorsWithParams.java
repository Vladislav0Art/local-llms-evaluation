package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConstructorsWithParams {

    @Test
    public void testConstructorsWithParams() {
        String url = "https://www.example.com?param1=value1&param2=value2";
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder);
        assertEquals("https", builder.uri());
        assertTrue(builder.params().containsKey("param1"));
        assertTrue(builder.params().containsKey("param2"));
    }

}