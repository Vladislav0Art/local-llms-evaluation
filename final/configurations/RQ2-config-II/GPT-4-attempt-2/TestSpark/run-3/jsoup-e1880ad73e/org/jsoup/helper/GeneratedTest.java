package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void buildTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
        when(keyValMock.key()).thenReturn("key");
        when(keyValMock.value()).thenReturn("value");
        urlBuilder.appendKeyVal(keyValMock);
    }

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
        when(keyValMock.key()).thenReturn("123");
        when(keyValMock.value()).thenReturn("\uFFFF");
        urlBuilder.appendKeyVal(keyValMock);
    }

    @Test
    public void UrlBuilderConstructorNullPointerTest() throws NullPointerException {
        new UrlBuilder(null);
    }

}