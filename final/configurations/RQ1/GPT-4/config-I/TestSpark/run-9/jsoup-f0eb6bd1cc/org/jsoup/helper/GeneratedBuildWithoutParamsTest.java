package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildWithoutParamsTest {

    @Test
    public void buildWithoutParamsTest() throws Exception {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL expected = new URL("http://www.example.com");
        assertEquals(expected, urlBuilder.build());
    }

}