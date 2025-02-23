package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        Assert.assertEquals("http://www.example.com/", outputUrl.toString());
    }

}