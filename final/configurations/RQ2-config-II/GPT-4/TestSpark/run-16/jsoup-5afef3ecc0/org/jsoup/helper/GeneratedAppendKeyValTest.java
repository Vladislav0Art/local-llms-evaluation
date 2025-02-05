package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest {

    @Mock
    Connection.KeyVal keyVal;

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value");

        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(keyVal);

        URL resultUrl = urlBuilder.build();
        assertEquals(new URL("http://www.example.com/?key=value"), resultUrl);
    }

}