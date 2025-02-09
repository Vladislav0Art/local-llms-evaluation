package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            URL builtUrl = urlBuilder.build();
            assertEquals(url, builtUrl);
        } catch (MalformedURLException e) {
            fail("Test failed due to MalformedURLException.");
        }
    }

}