package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildUrlWithQueryTest {

    @Test
    public void buildUrlWithQueryTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com?param=value");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        Assert.assertNotNull(result);
        Assert.assertEquals(result, builder.u);
    }

}