package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlWithQueryTest {

    @Test
    public void buildUrlWithQueryTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com?param=value");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL builtUrl = builder.build();
        assertEquals("http://example.com?param=value", builtUrl.toString());
    }

}