package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlWithRef {

    private URL url;

    @Before
    public void setup() throws MalformedURLException {
        url = new URL("https://www.example.com/");
    }

    @Test
    public void buildUrlWithRef() throws MalformedURLException {
        URL urlWithRef = new URL("https://www.example.com/#ref");
        UrlBuilder builder = new UrlBuilder(urlWithRef);
        URL normalizedUrl = builder.build();
        assertEquals("https://www.example.com/#ref", normalizedUrl.toString());
    }

}