package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderCreateTest {

    @Test
    public void UrlBuilderCreateTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        assertNotNull(new UrlBuilder(inputUrl));
    }

}