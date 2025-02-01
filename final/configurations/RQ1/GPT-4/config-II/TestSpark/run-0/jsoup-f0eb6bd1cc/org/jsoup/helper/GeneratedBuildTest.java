package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://test.com?q=abc");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL buildUrl = urlBuilder.build();
        assertEquals(buildUrl, new URL("http://test.com?q=abc"));
    }

}