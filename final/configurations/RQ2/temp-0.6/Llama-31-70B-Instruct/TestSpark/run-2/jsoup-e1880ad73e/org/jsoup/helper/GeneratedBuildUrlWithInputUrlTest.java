package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedBuildUrlWithInputUrlTest {

    @Test
    public void buildUrlWithInputUrlTest() throws Exception {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://www.example.com");

        assertEquals(expectedUrl, urlBuilder.build());
    }

}