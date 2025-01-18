package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedUrlBuilderValidUrlTest {

    @Test
    public void UrlBuilderValidUrlTest() {
        try {
            URL url = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}