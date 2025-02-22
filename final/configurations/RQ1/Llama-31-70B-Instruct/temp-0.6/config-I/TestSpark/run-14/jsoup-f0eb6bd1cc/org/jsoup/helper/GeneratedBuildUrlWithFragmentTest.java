package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildUrlWithFragmentTest {

    @Test
    public void buildUrlWithFragmentTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com/#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals("https://www.example.com/#fragment", builtUrl.toString());
    }

}