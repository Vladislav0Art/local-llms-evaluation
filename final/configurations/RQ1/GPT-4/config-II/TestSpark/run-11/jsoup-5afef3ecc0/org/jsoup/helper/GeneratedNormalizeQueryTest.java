package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedNormalizeQueryTest {

    @Test
    public void normalizeQueryTest() throws Exception {
        URL url = new URL("http://www.google.com/?q=test+query");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://www.google.com/?q=test+query", urlBuilder.build().toString());
    }

}