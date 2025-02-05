package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL url = builder.build();
        Assert.assertEquals("https://www.example.com", url.toString());
    }

}