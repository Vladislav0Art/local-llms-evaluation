package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class GeneratedTestNormalizeQuery {

    @Test
    public void testNormalizeQuery() {
        assertEquals("name=value", UrlBuilder.normalizeQuery("name = value"));
    }

}