package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

import org.junit.Test;

import java.net.URL;

public class GeneratedBuildTest_WithQueryString {

    @Test
    public void buildTest_WithQueryString() throws Exception {
        URL inputUrl = new URL("https://www.example.com?param=value");
        UrlBuilder obj = new UrlBuilder(inputUrl);
        URL builtURL = obj.build();
        assertNotNull(builtURL);
        assertEquals("param=value", builtURL.getQuery());
    }

}