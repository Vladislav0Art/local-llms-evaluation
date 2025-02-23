package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlNoQuery {

    private URL url;

    @Before
    public void setup() throws MalformedURLException {
        url = new URL("https://www.example.com/");
    }

    @Test
    public void buildUrlNoQuery() throws MalformedURLException {
        UrlBuilder builder = new UrlBuilder(url);
        URL normalizedUrl = builder.build();
        assertEquals("https://www.example.com/", normalizedUrl.toString());
    }

}