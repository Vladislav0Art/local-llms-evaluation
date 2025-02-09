package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() {
        try {
            URL url = new URL("http://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);

            Assert.assertNotNull(urlBuilder);
        } catch (MalformedURLException e) {
            Assert.fail("No exception should be thrown!");
        }
    }

    @Test
    public void UrlBuilderConstructorNullUrlTest() {
        try {
            URL url = null;
            UrlBuilder urlBuilder = new UrlBuilder(url);
        } catch (NullPointerException ex) {
            Assert.assertEquals("URL must not be null", ex.getMessage());
        }
    }

    @Test
    public void buildTest() {
        try {
            URL url = new URL("http://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);

            URL result = urlBuilder.build();

            Assert.assertNotNull(result);
            Assert.assertEquals("http://www.example.com", result.toString());
        } catch (MalformedURLException e) {
            Assert.fail("No exception should be thrown!");
        }
    }

    @Test
    public void appendKeyValNoEncodingRequiredTest() {
        try {
            URL url = new URL("http://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);

            KeyVal kv = KeyVal.create("key", "value");
            urlBuilder.appendKeyVal(kv);

            URL result = urlBuilder.build();

            Assert.assertNotNull(result);
            Assert.assertEquals("http://www.example.com?key=value", result.toString());
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            Assert.fail("No exception should be thrown!");
        }
    }

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws UnsupportedEncodingException {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        KeyVal kv = KeyVal.create("key{}", "value{}");
        urlBuilder.appendKeyVal(kv);
    }

}