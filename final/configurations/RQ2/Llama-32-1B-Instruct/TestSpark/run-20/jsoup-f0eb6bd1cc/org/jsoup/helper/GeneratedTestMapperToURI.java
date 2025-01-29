package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestMapperToURI {

    @Test
    public void testMapperToURI() {
        String url = "https://example.com";
        URI uri = new URI(toURI(url));
        assertEquals("https://" + url, uri.toString());
    }

}