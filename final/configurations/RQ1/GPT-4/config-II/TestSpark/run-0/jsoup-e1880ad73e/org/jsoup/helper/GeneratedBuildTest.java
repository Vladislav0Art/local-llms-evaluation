package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL newUrl = urlBuilder.build();
        assertNotNull(newUrl);
        assertEquals("http://example.com", newUrl.toString());
    }

}