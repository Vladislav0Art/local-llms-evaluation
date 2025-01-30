package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

import org.junit.Test;

import java.net.URL;

public class GeneratedBuildTest_WithInvalidQuery {

    @Test
    public void buildTest_WithInvalidQuery() throws Exception {
        URL inputUrl = new URL("https://www.example.com?param=\uD83D\uDE09");
        UrlBuilder obj = new UrlBuilder(inputUrl);
        URL builtURL = obj.build();
        assertNotNull(builtURL);
        assertNotEquals("\uD83D\uDE09", builtURL.getQuery());
    }

}