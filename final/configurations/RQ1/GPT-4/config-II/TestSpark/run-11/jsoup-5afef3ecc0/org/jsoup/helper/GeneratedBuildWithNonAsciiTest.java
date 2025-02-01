package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildWithNonAsciiTest {

    @Test
    public void buildWithNonAsciiTest() throws Exception {
        URL url = new URL("http://www.google.com/ú");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://www.google.com/%C3%BA", urlBuilder.build().toString());
    }

}