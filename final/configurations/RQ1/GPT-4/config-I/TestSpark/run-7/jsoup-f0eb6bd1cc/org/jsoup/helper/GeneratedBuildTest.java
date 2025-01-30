package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder obj = new UrlBuilder(inputUrl);
        URL transformedUrl = obj.build();
        assertEquals(inputUrl, transformedUrl);
    }

}