package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {


    @Mock
    private Connection.KeyVal keyVal;

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
    }

    @Test
    public void appendKeyValTest_whenKeyIsNull() throws UnsupportedEncodingException {
        when(keyVal.key()).thenReturn(null);
        when(keyVal.value()).thenReturn("value");
        urlBuilder.appendKeyVal(keyVal);
        URL result = urlBuilder.build();
        assertEquals(new URL("http://www.example.com"), result);
    }

    @Test
    public void appendKeyValTest_whenValueIsNull() throws UnsupportedEncodingException {
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn(null);
        urlBuilder.appendKeyVal(keyVal);
        URL result = urlBuilder.build();
        assertEquals(new URL("http://www.example.com"), result);
    }

    @Test
    public void appendKeyValTest_whenKeyAndValueAreNotNull() throws UnsupportedEncodingException {
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value");
        urlBuilder.appendKeyVal(keyVal);
        URL result = urlBuilder.build();
        assertEquals(new URL("http://www.example.com?key=value"), result);
    }

}