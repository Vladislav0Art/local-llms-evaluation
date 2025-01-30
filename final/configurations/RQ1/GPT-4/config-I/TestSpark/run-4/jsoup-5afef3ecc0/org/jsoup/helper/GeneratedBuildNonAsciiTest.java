package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildNonAsciiTest {

    @Test
    public void buildNonAsciiTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL resultUrl = urlBuilder.build();
        Assert.assertEquals("http://www.example.com", resultUrl.toString());
    }

}