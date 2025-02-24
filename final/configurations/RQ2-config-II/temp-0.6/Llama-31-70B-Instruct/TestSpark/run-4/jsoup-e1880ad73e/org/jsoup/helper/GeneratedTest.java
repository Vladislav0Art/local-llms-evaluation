package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedTest {

    private static final String UTF_8 = DataUtil.UTF_8;

    @Test
    public void buildEmptyUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL builtUrl = builder.build();
        Assert.assertEquals(inputUrl, builtUrl);
    }

    @Test
    public void buildInvalidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(new Connection.KeyVal("key1", "val1"));
        builder.build();
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key1", "val1");
        builder.appendKeyVal(kv);
        Assert.assertEquals(kv, builder.getQueryParams().get(0));
    }

    @Test
    public void appendKeyValInvalidEncodingTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key1", "val1");
        builder.appendKeyVal(kv);
    }

}