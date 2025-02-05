package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorValidUrlTest() throws MalformedURLException {
        URL url = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);
        Assert.assertNotNull(builder);
    }

    @Test
    public void urlBuilderConstructorNullUrlTest() {
        new UrlBuilder(null);
    }

    @Test
    public void buildValidUrlTest() throws MalformedURLException {
        URL url = new URL("https://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);
        URL outputUrl = builder.build();
        Assert.assertEquals(url, outputUrl);
    }

    @Test
    public void buildEmptyUrlTest() throws MalformedURLException {
        URL url = new URL("");
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

    @Test
    public void appendKeyValValidInputTest() throws UnsupportedEncodingException, MalformedURLException {
        URL url = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);

        when(kv.key()).thenReturn("key");
        when(kv.value()).thenReturn("value");

        builder.appendKeyVal(kv);
        URL expectedURL = new URL("http://www.example.com?key=value");
        Assert.assertEquals(expectedURL, builder.build());
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException, MalformedURLException {
        URL url = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);

        when(kv.key()).thenReturn("unsupported_character_£");
        when(kv.value()).thenReturn("value");

        builder.appendKeyVal(kv);
    }

}