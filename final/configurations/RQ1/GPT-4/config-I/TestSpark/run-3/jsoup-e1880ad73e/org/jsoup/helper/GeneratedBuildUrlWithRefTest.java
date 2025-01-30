package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildUrlWithRefTest {

    @Test
    public void buildUrlWithRefTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com#section");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        Assert.assertNotNull(result);
        Assert.assertEquals(result, builder.u);
    }

}