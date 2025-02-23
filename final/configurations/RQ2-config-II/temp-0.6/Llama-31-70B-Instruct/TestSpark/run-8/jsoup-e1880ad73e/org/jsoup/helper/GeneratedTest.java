package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.junit.Assert;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedTest {

    @Test
    public void buildWithoutQueryAndFragmentTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        Assert.assertEquals(inputUrl, outputUrl);
    }

}