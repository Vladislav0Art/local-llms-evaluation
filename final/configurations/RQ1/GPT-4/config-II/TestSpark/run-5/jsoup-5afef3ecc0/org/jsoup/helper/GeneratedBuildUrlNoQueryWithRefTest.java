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

public class GeneratedBuildUrlNoQueryWithRefTest {

    @Test
    public void buildUrlNoQueryWithRefTest() throws MalformedURLException {
        URL url = new URL("http://example.com#ref");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        assertEquals(url, urlBuilder.build());
        assertNotEquals(new URL("http://example.in"), urlBuilder.build());
    }

}