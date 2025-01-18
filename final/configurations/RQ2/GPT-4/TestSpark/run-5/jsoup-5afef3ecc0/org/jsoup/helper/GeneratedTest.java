package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Connection.KeyVal mockedKeyVal;

    @Test
    public void UrlBuilderInitializationTest() throws MalformedURLException {
        URL inputUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals(inputUrl, builtUrl);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        when(mockedKeyVal.key()).thenReturn("key");
        when(mockedKeyVal.value()).thenReturn("value");

        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://test.com"));
        urlBuilder.appendKeyVal(mockedKeyVal);
        URL builtUrl = urlBuilder.build();

        assertTrue(builtUrl.toString().contains("key=value"));
    }

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws UnsupportedEncodingException, MalformedURLException {
        when(mockedKeyVal.key()).thenReturn("key");
        when(mockedKeyVal.value()).thenReturn("\uD800\uDC00");

        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://test.com"));
        urlBuilder.appendKeyVal(mockedKeyVal);
        urlBuilder.build();
    }

}