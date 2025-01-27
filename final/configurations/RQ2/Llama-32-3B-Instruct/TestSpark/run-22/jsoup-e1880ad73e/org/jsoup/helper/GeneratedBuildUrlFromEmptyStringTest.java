package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.IDN;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildUrlFromEmptyStringTest {

    @Test
    public void buildUrlFromEmptyStringTest() throws MalformedURLException, URISyntaxException {
        URL url = new UrlBuilder("").build();
        assertNotNull(url);
        assertEquals("", url.getProtocol());
        assertEquals("", url.getHost());
        assertEquals("", url.getPath());
        assertEquals(0, url.getPort());
    }

}