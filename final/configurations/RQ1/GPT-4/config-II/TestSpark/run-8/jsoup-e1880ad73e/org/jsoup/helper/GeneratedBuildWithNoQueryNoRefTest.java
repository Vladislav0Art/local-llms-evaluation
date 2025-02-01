package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedBuildWithNoQueryNoRefTest {

    @Test
    public void buildWithNoQueryNoRefTest() throws Exception {
        URL inputUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        Assert.assertEquals(inputUrl, resultUrl);
    }

}