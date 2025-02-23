package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        assertNotNull(urlBuilder.build());
        assertEquals("http://www.example.com", urlBuilder.build().toString());
    }

}