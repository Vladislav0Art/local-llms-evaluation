package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildUrlWithQueryAndFragmentTest {

    @Test
    public void buildUrlWithQueryAndFragmentTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com/?q=test#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals("https://www.example.com/?q=test#fragment", builtUrl.toString());
    }

}