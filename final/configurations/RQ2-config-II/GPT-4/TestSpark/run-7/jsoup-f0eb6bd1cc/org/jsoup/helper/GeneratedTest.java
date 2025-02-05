package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL inputUrl = new URL("http://localhost");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Assert.assertNotNull(urlBuilder);
    }

    @Test
    public void buildValidURLTest() {
        try {
            URL inputUrl = new URL("http://localhost");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            URL resultUrl = urlBuilder.build();
            assertEquals(inputUrl, resultUrl);
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    public void buildMalformedURLTest() {
        try {
            URL inputUrl = new URL("^malformed.url");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            URL resultUrl = urlBuilder.build();
        } catch (Exception e) {
            throw new MalformedURLException();
        }
    }

    @Test
    public void appendKeyValTest() {
        try {
            URL inputUrl = new URL("http://localhost");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
            urlBuilder.appendKeyVal(kv);
            assertTrue(urlBuilder.build().getQuery().contains("key=value"));
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    public void appendKeyValWithUnsupportedEncodingExceptionTest() {
        try {
            URL inputUrl = new URL("http://localhost");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = Connection.KeyVal.create("key", "\uD800");
            urlBuilder.appendKeyVal(kv);
        } catch (Exception e) {
            throw new UnsupportedEncodingException();
        }
    }

}