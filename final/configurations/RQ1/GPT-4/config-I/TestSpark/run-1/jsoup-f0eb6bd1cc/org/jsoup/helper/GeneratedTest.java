package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTest {

    private class SimpleKeyVal implements Connection.KeyVal {

        private String key;
        private String value;

        public SimpleKeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String key() {
            return key;
        }

        @Override
        public Connection.KeyVal key(String s) {
            key = s;
            return this;
        }

        @Override
        public String value() {
            return value;
        }

        @Override
        public Connection.KeyVal value(String s) {
            value = s;
            return this;
        }
    }

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Assert.assertNotNull(urlBuilder);
        Assert.assertEquals("http://www.google.com/", urlBuilder.u.toString());
    }

    @Test
    public void BuildNoQueryStringTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();

        Assert.assertEquals("http://www.google.com/", result.toString());
    }

    @Test
    public void BuildWithQueryStringTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com/search?q=test");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();

        Assert.assertEquals("http://www.google.com/search?q=test", result.toString());
    }

    @Test
    public void BuildNonAsciiQueryTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com/search?q=тест");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();

        Assert.assertNotEquals("http://www.google.com/search?q=тест", result.toString());
        Assert.assertEquals("http://www.google.com/search?q=%D1%82%D0%B5%D1%81%D1%82", result.toString());
    }

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertNotNull(urlBuilder);
        Assert.assertEquals("http://www.google.com/", urlBuilder.u.toString());
    }

    @Test
    public void BuildNoQueryStringTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        Assert.assertEquals("http://www.google.com/", result.toString());
    }

    @Test
    public void BuildWithQueryStringTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com/search?q=test");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        Assert.assertEquals("http://www.google.com/search?q=test", result.toString());
    }

    @Test
    public void BuildNonAsciiQueryTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com/search?q=тест");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        Assert.assertNotEquals("http://www.google.com/search?q=тест", result.toString());
        Assert.assertEquals("http://www.google.com/search?q=%D1%82%D0%B5%D1%81%D1%82", result.toString());
    }

}