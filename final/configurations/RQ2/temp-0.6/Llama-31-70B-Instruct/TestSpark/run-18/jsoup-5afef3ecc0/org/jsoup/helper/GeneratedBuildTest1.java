package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildTest1 {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder();
    }

    @Test
    public void buildTest1() throws Exception {
        URL url = new URL("http://www.example.com");
        urlBuilder.setUrl(url);
        URL normalizedUrl = urlBuilder.build();
        assertNotNull(normalizedUrl);
        assertEquals("http://www.example.com", normalizedUrl.toString());
    }

}