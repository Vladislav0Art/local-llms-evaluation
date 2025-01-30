package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlWithUmlautTest {

    @Test
    public void buildUrlWithUmlautTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/äöü");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL builtUrl = builder.build();
        assertEquals("http://example.com/%C3%A4%C3%B6%C3%BC", builtUrl.toString());
    }

}