package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("https://www.example.com", result.toString());
    }

}