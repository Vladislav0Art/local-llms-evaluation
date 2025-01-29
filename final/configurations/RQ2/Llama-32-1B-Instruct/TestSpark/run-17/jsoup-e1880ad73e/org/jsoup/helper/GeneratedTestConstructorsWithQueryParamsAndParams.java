package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConstructorsWithQueryParamsAndParams {

    @Test
    public void testConstructorsWithQueryParamsAndParams() {
        String url = "https://www.example.com?query1=value1&param1=value1&param2=value2";
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder);
        assertEquals("https", builder.uri());
        assertTrue(builder.queryParams().containsKey("query1"));
        assertTrue(builder.params().containsKey("param1"));
        assertTrue(builder.params().containsKey("param2"));
    }

}