package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedUrlBuilderInputURLTest {

    @Test
    public void UrlBuilderInputURLTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertThat(urlBuilder.build(), is(inputUrl));
    }

}