package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            URL inputUrl = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

            assertNotNull(urlBuilder.build());
        } catch (MalformedURLException e) {
            fail("MalformedURLException is not expected here");
        }
    }

}