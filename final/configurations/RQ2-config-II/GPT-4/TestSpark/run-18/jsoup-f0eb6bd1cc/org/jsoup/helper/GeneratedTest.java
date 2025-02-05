package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderNullInputUrlTest() throws MalformedURLException {
        URL inputUrl = null;
        boolean thrown = false;
        try {
            UrlBuilder builder = new UrlBuilder(inputUrl);
        } catch (NullPointerException e) {
            thrown = true;
        }
        Assert.assertTrue(thrown);
    }

    @Test
    public void UrlBuilderValidInputUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Assert.assertNotNull(builder);
    }

    @Test
    public void buildUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL resultUrl = builder.build();
        Assert.assertEquals(resultUrl, inputUrl);
    }

    @Test
    public void appendKeyValNullTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = null;
        boolean thrown = false;
        try {
            URL inputUrl = new URL("http://www.example.com");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            builder.appendKeyVal(kv);
        } catch (NullPointerException e) {
            thrown = true;
        }
        Assert.assertTrue(thrown);
    }

    @Test
    public void appendKeyValValidTest() throws UnsupportedEncodingException {
        URL inputUrl = null;
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("testKey");
        when(kv.value()).thenReturn("testValue");
        try {
            inputUrl = new URL("http://www.example.com");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            builder.appendKeyVal(kv);
            URL resultUrl = builder.build();
            String expectedUrl = "http://www.example.com?testKey=testValue";
            Assert.assertEquals(resultUrl.toString(), URLDecoder.decode(expectedUrl, "UTF-8"));
        } catch (MalformedURLException e) {
            Assert.fail("URL is not correctly formed.");
        }
    }

}