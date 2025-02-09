package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildForValidURLTest {

    @Test
    public void buildForValidURLTest() throws MalformedURLException {
        URL url = new URL("https://www.google.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(url, builder.build());
    }

}