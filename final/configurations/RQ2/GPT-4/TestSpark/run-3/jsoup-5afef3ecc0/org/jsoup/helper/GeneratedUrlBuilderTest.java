package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedUrlBuilderTest {

    @Test
    public void urlBuilderTest() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            assertNotNull(urlBuilder);
        } catch (MalformedURLException mue) {
            fail("MalformedURLException should not have been thrown.");
        }
    }

}