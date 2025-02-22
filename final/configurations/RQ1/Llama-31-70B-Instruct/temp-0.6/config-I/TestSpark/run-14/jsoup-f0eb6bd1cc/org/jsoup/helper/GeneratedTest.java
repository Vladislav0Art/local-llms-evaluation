package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void buildUrlTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals("https://www.example.com/", builtUrl.toString());
    }

    @Test
    public void buildUrlWithQueryTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com/?q=test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals("https://www.example.com/?q=test", builtUrl.toString());
    }

    @Test
    public void buildUrlWithFragmentTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com/#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals("https://www.example.com/#fragment", builtUrl.toString());
    }

    @Test
    public void buildUrlWithQueryAndFragmentTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com/?q=test#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals("https://www.example.com/?q=test#fragment", builtUrl.toString());
    }

}