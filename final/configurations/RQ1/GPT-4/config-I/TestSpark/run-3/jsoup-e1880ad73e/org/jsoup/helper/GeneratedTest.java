package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder);
    }

    @Test
    public void UrlBuilderConstructorNullUrlTest() throws MalformedURLException {
        URL inputUrl = null;
        UrlBuilder builder = new UrlBuilder(inputUrl);
    }

    @Test
    public void buildValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertNotNull(result);
        assertEquals(result, builder.u);
    }

    @Test
    public void buildUrlWithQueryTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com?param=value");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertNotNull(result);
        assertEquals(result, builder.u);
    }

    @Test
    public void buildUrlWithRefTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com#section");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertNotNull(result);
        assertEquals(result, builder.u);
    }

    @Test
    public void UrlBuilderConstructorValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Assert.assertNotNull(builder);
    }

    @Test
    public void buildValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        Assert.assertNotNull(result);
        Assert.assertEquals(result, builder.u);
    }

    @Test
    public void buildUrlWithQueryTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com?param=value");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        Assert.assertNotNull(result);
        Assert.assertEquals(result, builder.u);
    }

    @Test
    public void buildUrlWithRefTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com#section");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        Assert.assertNotNull(result);
        Assert.assertEquals(result, builder.u);
    }

}