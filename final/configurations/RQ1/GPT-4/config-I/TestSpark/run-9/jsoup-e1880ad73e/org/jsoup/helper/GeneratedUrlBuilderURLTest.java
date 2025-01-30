package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedUrlBuilderURLTest {

    @Test
    public void UrlBuilderURLTest() {
        try {
            URL url = new URL("https://test.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            assertEquals(url, urlBuilder.build());
        } catch (MalformedURLException ex) {
            fail("No exception should be thrown.");
        }
    }

}