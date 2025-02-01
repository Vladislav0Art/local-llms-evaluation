package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedNormalizeQueryTest {

    @Test
    public void normalizeQueryTest() throws MalformedURLException {
        URL url = new URL("http://abc.com?query=value+encoded");
        UrlBuilder builder = new UrlBuilder(url);

        Assert.assertEquals("http://abc.com/?query=value%2Bencoded", builder.build().toString());
    }

}