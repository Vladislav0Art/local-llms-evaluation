package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedBuildWithNonAsciiHostTest {

    @Test
    public void buildWithNonAsciiHostTest() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://\u2211.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL normalizedURL = urlBuilder.build();
        assertEquals("http://xn--74h.com", normalizedURL.toString());
    }

}