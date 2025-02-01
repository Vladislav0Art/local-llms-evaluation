package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://test.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(Connection.KeyVal.create("key", "value"));
        Assert.assertTrue(builder.build().toString().contains("key=value"));
    }

}