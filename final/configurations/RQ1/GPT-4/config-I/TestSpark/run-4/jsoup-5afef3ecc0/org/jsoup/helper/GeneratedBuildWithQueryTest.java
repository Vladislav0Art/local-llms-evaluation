package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildWithQueryTest {

    @Test
    public void buildWithQueryTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com?param=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL resultUrl = urlBuilder.build();
        Assert.assertEquals("http://www.example.com?param=value", resultUrl.toString());
    }

}