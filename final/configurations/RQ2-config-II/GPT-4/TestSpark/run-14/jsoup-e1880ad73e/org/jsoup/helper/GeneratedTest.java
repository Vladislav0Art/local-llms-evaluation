package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() {
        String stringUrl = "http://test.url";
        try {
            URL url = new URL(stringUrl);
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Assert.assertNotNull(urlBuilder);
        } catch (MalformedURLException e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

    @Test
    public void UrlBuilderConstructorInvalidUrlTest() {
        String stringUrl = "invalid\\test\\url";
        try {
            URL url = new URL(stringUrl);
            Assert.fail("Exception should have been thrown");
        } catch (MalformedURLException e) {
            Assert.assertNotNull(e);
        }
    }

    @Test
    public void buildTest() {
        String stringUrl = "http://test.url";
        try {
            URL url = new URL(stringUrl);
            UrlBuilder urlBuilder = new UrlBuilder(url);
            URL builtUrl = urlBuilder.build();
            Assert.assertNotNull(builtUrl);
        } catch (MalformedURLException e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

    @Test
    public void appendKeyValTest() {
        String stringUrl = "http://test.url";
        try {
            URL url = new URL(stringUrl);
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal keyValMock = Mockito.mock(Connection.KeyVal.class);
            try {
                urlBuilder.appendKeyVal(keyValMock);
            } catch (Exception e) {
                Assert.fail("Exception should not have been thrown");
            }
        } catch (MalformedURLException e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

    @Test
    public void appendKeyValInvalidEncodingTest() throws UnsupportedEncodingException {
        String url = "http://test.url";
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
            Connection.KeyVal mockKeyVal = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(mockKeyVal.key()).thenReturn("\uD800");
            urlBuilder.appendKeyVal(mockKeyVal);

        } catch (MalformedURLException e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

}