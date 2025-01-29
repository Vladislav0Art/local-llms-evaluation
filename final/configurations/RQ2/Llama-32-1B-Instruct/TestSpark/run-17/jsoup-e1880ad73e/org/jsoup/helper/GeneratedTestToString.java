package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        String url = "https://www.example.com";
        assertTrue(UrlBuilder.toString(url).contains("https"));
    }

}