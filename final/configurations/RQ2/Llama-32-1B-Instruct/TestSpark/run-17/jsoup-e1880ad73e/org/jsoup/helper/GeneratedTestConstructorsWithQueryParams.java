package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConstructorsWithQueryParams {

    @Test
    public void testConstructorsWithQueryParams() {
        String url = "https://www.example.com?query1=value1&query2=value2";
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder);
        assertEquals("https", builder.uri());
        assertTrue(builder.queryParams().containsKey("query1"));
        assertTrue(builder.queryParams().containsKey("query2"));
    }

}