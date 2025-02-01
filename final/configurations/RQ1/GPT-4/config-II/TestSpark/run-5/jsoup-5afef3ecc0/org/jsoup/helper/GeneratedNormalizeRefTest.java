package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedNormalizeRefTest {

    @Test
    public void normalizeRefTest() throws MalformedURLException {
        URL url = new URL("http://example.com#test ref");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        String normalizedRef = UrlBuilder.normalizeRef("test ref");
        assertEquals("test%20ref", normalizedRef);
    }

}