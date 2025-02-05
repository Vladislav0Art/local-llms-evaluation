package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderURLInputTest {

    @Test
    public void UrlBuilderURLInputTest() {
        try {
            URL inputUrl = new URL("http://localhost");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            assertNotNull(urlBuilder);
        } catch (MalformedURLException ex) {
            fail("MalformedURLException thrown: " + ex.getMessage());
        }
    }

}