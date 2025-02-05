package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() {
        try {
            URL testUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilderTest = new UrlBuilder(testUrl);
            Assert.assertNotNull(urlBuilderTest);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void BuildMethodWithValidURLTest() {
        try {
            URL testUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilderTest = new UrlBuilder(testUrl);
            URL resultUrl = urlBuilderTest.build();
            Assert.assertNotNull(resultUrl);
            Assert.assertEquals(testUrl.toString(), resultUrl.toString());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void BuildMethodWithInvalidURLTest() {
        try {
            URL testUrl = new URL("invalid_url");
            UrlBuilder urlBuilderTest = new UrlBuilder(testUrl);
            URL resultUrl = urlBuilderTest.build();
            Assert.fail("Expected exception not thrown");
        } catch (Exception e) {
            Assert.assertTrue(e instanceof MalformedURLException);
        }
    }

    @Test
    public void AppendKeyValMethodTest() {
        try {
            URL testUrl = new URL("https://www.google.com");
            Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(kv.key()).thenReturn("key");
            Mockito.when(kv.value()).thenReturn("value");
            UrlBuilder urlBuilderTest = new UrlBuilder(testUrl);
            urlBuilderTest.appendKeyVal(kv);
            URL resultUrl = urlBuilderTest.build();
            Assert.assertTrue(resultUrl.toString().contains("key=value"));
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void AppendKeyValWithUnsupportedEncodingExceptionTest() {
        try {
            URL testUrl = new URL("https://www.google.com");
            Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(kv.key()).thenReturn("key");
            Mockito.when(kv.value()).thenThrow(UnsupportedEncodingException.class);
            UrlBuilder urlBuilderTest = new UrlBuilder(testUrl);
            urlBuilderTest.appendKeyVal(kv);
            Assert.fail("Expected exception not thrown");
        } catch (Exception e) {
            Assert.assertTrue(e instanceof UnsupportedEncodingException);
        }
    }

}