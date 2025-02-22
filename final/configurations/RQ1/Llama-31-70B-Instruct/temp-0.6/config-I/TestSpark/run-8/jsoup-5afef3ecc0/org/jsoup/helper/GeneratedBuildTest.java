package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com/path?query=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();

        assertEquals("https://www.example.com/path?query=value", result.toString());
    }

}