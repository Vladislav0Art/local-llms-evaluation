package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL outputUrl = urlBuilder.build();

        Assert.assertEquals(inputUrl, outputUrl);
    }

}