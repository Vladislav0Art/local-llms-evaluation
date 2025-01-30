package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws Exception {
        URL inputURL = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputURL);
        URL resultURL = urlBuilder.build();

        assertEquals(inputURL, resultURL);
    }

}