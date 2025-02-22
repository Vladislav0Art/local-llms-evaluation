package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildUrlTest {

    @Test
    public void buildUrlTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals("https://www.example.com/", builtUrl.toString());
    }

}