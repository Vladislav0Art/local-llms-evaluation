package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void urlBuilderCreationTest() throws MalformedURLException {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        assertEquals(url, builtUrl);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);

        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyVal);

        URL builtUrl = urlBuilder.build();
        assertEquals(new URL("http://www.example.com?key=value"), builtUrl);
    }

    @Test
    public void appendKeyValTest_InvalidValue_ExpectException() throws UnsupportedEncodingException, MalformedURLException {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);

        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("\uD800");

        urlBuilder.appendKeyVal(keyVal);
    }

}