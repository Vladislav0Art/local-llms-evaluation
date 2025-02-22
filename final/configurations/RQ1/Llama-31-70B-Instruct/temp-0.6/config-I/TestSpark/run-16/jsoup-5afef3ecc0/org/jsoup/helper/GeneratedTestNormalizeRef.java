package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class GeneratedTestNormalizeRef {

    @Test
    public void testNormalizeRef() {
        assertEquals("name%20value", UrlBuilder.normalizeRef("name value"));
    }

}