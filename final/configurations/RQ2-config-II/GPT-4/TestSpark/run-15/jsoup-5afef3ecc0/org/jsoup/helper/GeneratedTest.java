package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        URL testUrl = new URL("http://www.test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);

        Assert.assertNotNull(builder);
    }

    @Test
    public void UrlBuilderConstructorNullInputTest() {
        UrlBuilder builder = new UrlBuilder(null);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL testUrl = new URL("http://www.test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);
        URL result = builder.build();

        Assert.assertEquals(testUrl, result);
    }

    @Test
    public void buildInvalidUrlTest() throws MalformedURLException {
        URL testUrl = new URL("http:\\test-invalid-url");
        UrlBuilder builder = new UrlBuilder(testUrl);
        builder.build();
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL testUrl = new URL("http://www.test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);

        Connection.KeyVal keyValMock = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyValMock.key()).thenReturn("testKey");
        Mockito.when(keyValMock.value()).thenReturn("testValue");

        builder.appendKeyVal(keyValMock);
        URL result = builder.build();

        Assert.assertEquals(true, result.toString().contains("testKey=testValue"));
    }

    @Test
    public void appendKeyValNullInputTest() throws UnsupportedEncodingException {
        URL testUrl = new URL("http://www.test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);

        builder.appendKeyVal(null);
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL testUrl = new URL("http://www.test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);

        Connection.KeyVal keyValStub = new Connection.KeyVal() {

            @Override
            public String key() {
                return "testKey";
            }

            @Override
            public String value() {
                return "\uD800";
            }
        };

        builder.appendKeyVal(keyValStub);
    }

}