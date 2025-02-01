package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("http://test.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Assert.assertEquals("http://test.com", builder.build().toString());
    }

}