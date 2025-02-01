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

public class GeneratedBuildUrlWithUnicodeTest {

    @Test
    public void buildUrlWithUnicodeTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.google.com/search?q=tést");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("https://www.google.com/search?q=t%C3%A9st");
        Assert.assertEquals(urlBuilder.build(), expectedUrl);
    }

}