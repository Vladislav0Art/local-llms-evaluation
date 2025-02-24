package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URL;

public class GeneratedBuildWithValidUrlTest {

    @Test
    public void buildWithValidUrlTest() throws URISyntaxException {
        URL validUrl = new URL("https://example.com/path?param1=value1");
        UrlBuilder urlBuilder = new UrlBuilder(validUrl);
        URL builtUrl = urlBuilder.build();
        Assert.assertEquals(validUrl, builtUrl);
    }

}