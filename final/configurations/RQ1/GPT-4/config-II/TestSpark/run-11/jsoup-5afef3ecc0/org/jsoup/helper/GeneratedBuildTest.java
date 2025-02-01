package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://www.google.com/#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://www.google.com/#fragment", urlBuilder.build().toString());
    }

}