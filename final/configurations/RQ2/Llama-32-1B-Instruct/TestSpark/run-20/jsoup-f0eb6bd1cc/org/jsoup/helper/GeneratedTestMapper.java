package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestMapper {

    @Test
    public void testMapper() {
        String url = "https://example.com";
        assertEquals("https://" + url.replace("://", "") + "/", toURI(url));
    }

}