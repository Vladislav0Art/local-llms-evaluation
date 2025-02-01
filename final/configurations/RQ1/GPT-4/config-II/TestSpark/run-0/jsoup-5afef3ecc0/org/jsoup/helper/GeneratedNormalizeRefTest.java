package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedNormalizeRefTest {

    @Test
    public void normalizeRefTest() throws Exception {
        URL url = new URL("http://example.com#ref with space");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL expectedUrl = new URL("http://example.com#ref%20with%20space");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}