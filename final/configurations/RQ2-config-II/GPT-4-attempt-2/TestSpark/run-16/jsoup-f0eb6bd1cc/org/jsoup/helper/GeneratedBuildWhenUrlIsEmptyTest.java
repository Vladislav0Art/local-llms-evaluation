package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildWhenUrlIsEmptyTest {

    @Test
    public void buildWhenUrlIsEmptyTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL(""));

        URL builtUrl = urlBuilder.build();

        Assert.assertNotNull(builtUrl);
        Assert.assertEquals("", builtUrl.toString());
    }

}