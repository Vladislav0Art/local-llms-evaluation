package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL testUrl = new URL("https://www.test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);
        URL builtUrl = builder.build();
        Assert.assertEquals(testUrl.toString(), builtUrl.toString());
    }

}