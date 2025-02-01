package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedNormalizeRefTest {

    @Test
    public void normalizeRefTest() {
        String result = UrlBuilder.normalizeRef("ref");
        assertEquals("ref", result);
    }

}