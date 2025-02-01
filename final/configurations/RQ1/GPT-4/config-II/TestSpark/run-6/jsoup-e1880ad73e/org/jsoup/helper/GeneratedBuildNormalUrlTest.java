package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildNormalUrlTest {

    @Test
    public void buildNormalUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.google.com/search?q=test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("https://www.google.com/search?q=test");
        Assert.assertEquals(urlBuilder.build(), expectedUrl);
    }

}