package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUrlBuilder_noException {

    @Test
    public void urlBuilder_noException() {
        URLBuilder builder = new UrlBuilder("https://example.com");
        assertEquals("https://example.com", builder.build());
    }

}