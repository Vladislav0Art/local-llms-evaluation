package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GeneratedBuildNonAsciiTest {

    @Test
    public void buildNonAsciiTest() throws MalformedURLException {
        URL inputUrl = new URL("http://测试.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Assert.assertEquals("http://xn--0zwm56d.com", builder.build().toString());
    }

}