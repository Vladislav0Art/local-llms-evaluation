package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            URL url = new URL("http://www.example.com/test");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            URL builtUrl = urlBuilder.build();
            assertEquals("http://www.example.com/test", builtUrl.toString());
        } catch (MalformedURLException e) {
            fail("URL is not valid: " + e.getMessage());
        }
    }

}