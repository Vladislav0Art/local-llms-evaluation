package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedUrlBuilder_ValidInput_Test {

    @Test
    public void UrlBuilder_ValidInput_Test() throws Exception {
        URL inputUrl = new URL("http://www.test.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Assert.assertNotNull(builder);
    }

}