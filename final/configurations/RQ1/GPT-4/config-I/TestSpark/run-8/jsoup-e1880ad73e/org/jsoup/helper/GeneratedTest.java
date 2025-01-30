package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void buildValidURLTest() throws MalformedURLException {
        URL validUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(validUrl);
        Assert.assertEquals("http://example.com", urlBuilder.build().toString());
    }

    @Test
    public void buildInvalidURLTest() throws MalformedURLException {
        URL invalidUrl = new URL("http://exa[mple.com");
        UrlBuilder urlBuilder = new UrlBuilder(invalidUrl);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        //mocking KeyVal object
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyVal);
        Assert.assertTrue(urlBuilder.u.toString().contains("?key=value"));
    }

    @Test
    public void appendKeyValMultipleTimesTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        //mocking KeyVal object
        Connection.KeyVal keyValOne = Mockito.mock(Connection.KeyVal.class);
        when(keyValOne.key()).thenReturn("keyOne");
        when(keyValOne.value()).thenReturn("valueOne");

        Connection.KeyVal keyValTwo = Mockito.mock(Connection.KeyVal.class);
        when(keyValTwo.key()).thenReturn("keyTwo");
        when(keyValTwo.value()).thenReturn("valueTwo");

        urlBuilder.appendKeyVal(keyValOne);
        urlBuilder.appendKeyVal(keyValTwo);

        Assert.assertTrue(urlBuilder.u.toString().contains("?keyOne=valueOne&keyTwo=valueTwo"));
    }

    @Test
    public void appendKeyValNonEnglishTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        //mocking KeyVal object
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        when(keyVal.key()).thenReturn("ключ");
        when(keyVal.value()).thenReturn("значение");

        urlBuilder.appendKeyVal(keyVal);
        Assert.assertTrue(urlBuilder.u.toString().contains("?%D0%BA%D0%BB%D1%8E%D1%87=%D0%B7%D0%BD%D0%B0%D1%87%D0%B5%D0%BD%D0%B8%D0%B5"));
    }

}