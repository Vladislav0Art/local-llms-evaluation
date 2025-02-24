package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        URL actual = urlBuilder.build();
        assertEquals("http://example.com", actual.toString());
    }

}