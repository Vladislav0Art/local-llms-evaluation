package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedBuild_ValidUrl_Test {

    @Test
    public void build_ValidUrl_Test() throws Exception {
        URL inputUrl = new URL("http://www.test.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL outputUrl = builder.build();
        Assert.assertEquals(inputUrl, outputUrl);
    }

}