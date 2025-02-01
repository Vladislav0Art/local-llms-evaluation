package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedNormalizeRefTest {

    @Test
    public void normalizeRefTest() throws MalformedURLException {
        URL url = new URL("http://abc.com?query=value#reference");
        UrlBuilder builder = new UrlBuilder(url);

        Assert.assertEquals("http://abc.com/?query=value#reference", builder.build().toString());
    }

}