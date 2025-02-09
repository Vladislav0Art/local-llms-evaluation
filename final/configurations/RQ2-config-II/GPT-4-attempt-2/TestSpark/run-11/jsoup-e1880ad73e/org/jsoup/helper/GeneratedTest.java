package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();
        assertNotNull(url);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL inputUrl = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("testKey");
        Mockito.when(keyVal.value()).thenReturn("testValue");
        try {
            urlBuilder.appendKeyVal(keyVal);
            URL url = urlBuilder.build();
            assertEquals("http://www.google.com?testKey=testValue", url.toString());
        } catch (UnsupportedEncodingException e) {
            fail("Should not have thrown any exception");
        }
    }

    @Test
    public void appendKeyValWithExceptionTest() throws UnsupportedEncodingException, MalformedURLException {
        URL inputUrl = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("testKey");
        Mockito.when(keyVal.value()).thenReturn("\uD800"); // surrogate pair triggers the exception
        urlBuilder.appendKeyVal(keyVal);
    }

}