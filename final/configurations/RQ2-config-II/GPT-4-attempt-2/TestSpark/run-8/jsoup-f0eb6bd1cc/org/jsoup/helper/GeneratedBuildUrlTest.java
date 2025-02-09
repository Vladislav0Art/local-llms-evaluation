package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertNotNull;

public class GeneratedBuildUrlTest {

    @Test
    public void buildUrlTest() throws MalformedURLException {
        URL mockUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(mockUrl);
        URL builtUrl = urlBuilder.build();
        assertNotNull(builtUrl);
        assertEquals("http://example.com", builtUrl.toString());
    }

}