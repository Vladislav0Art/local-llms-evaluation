package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void buildValidInputUrlNoQueryNoRefTest() throws Exception {
        URL inputUrl = new URL("https", "www.google.com", "/home");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        assertEquals("https://www.google.com/home", resultUrl.toString());
    }

    @Test
    public void buildValidInputUrlWithQueryTest() throws Exception {
        URL inputUrl = new URL("https://www.google.com/search?q=unit+test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        assertEquals("https://www.google.com/search?q=unit+test", resultUrl.toString());
    }

    @Test
    public void buildValidInputUrlWithRefTest() throws Exception {
        URL inputUrl = new URL("https://www.google.com/tutorial#step1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        assertEquals("https://www.google.com/tutorial#step1", resultUrl.toString());
    }

    @Test
    public void buildInvalidInputUrlTest() throws Exception {
        URL inputUrl = new URL("https://www.invalid__.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        assertEquals("https://www.invalid__.com", resultUrl.toString());
    }

}