package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedNormalizeRefTest {

    @Test
    public void normalizeRefTest() throws Exception {
        URL url = new URL("http://www.google.com/#fragment part");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://www.google.com/#fragment%20part", urlBuilder.build().toString());
    }

}