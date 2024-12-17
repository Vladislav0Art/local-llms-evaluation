package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class GeneratedNormalizeQueryTest {

    @Test
    public void normalizeQueryTest() {
        String q = " query";
        String normalizedQ = UrlBuilder.normalizeQuery(q);
        assertEquals("query", normalizedQ);
    }

}