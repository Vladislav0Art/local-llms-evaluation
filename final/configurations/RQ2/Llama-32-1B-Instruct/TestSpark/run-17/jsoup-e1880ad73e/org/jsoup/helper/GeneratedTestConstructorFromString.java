package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConstructorFromString {

    @Test
    public void testConstructorFromString() {
        UrlBuilder builder = new UrlBuilder("https://www.example.com");
        assertEquals(builder, UrlBuilder.fromUri(builder.uri));
    }

}