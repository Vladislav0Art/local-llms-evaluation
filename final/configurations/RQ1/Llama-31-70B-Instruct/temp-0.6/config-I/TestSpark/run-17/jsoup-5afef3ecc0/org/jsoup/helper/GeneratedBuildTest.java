package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com/");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        URL outputUrl = builder.build();

        assertEquals("https://www.example.com/", outputUrl.toString());
    }

}