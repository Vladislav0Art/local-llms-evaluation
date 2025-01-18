package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_ValidKeyValTest {

    @Mock
    private Connection.KeyVal keyVal;

    @Test
    public void appendKeyVal_ValidKeyValTest() {
        try {
            when(keyVal.key()).thenReturn("key");
            when(keyVal.value()).thenReturn("value");
            URL url = new URL("https://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            urlBuilder.appendKeyVal(keyVal);
            assertEquals("https://www.example.com?key=value", urlBuilder.build().toString());
        } catch (UnsupportedEncodingException | MalformedURLException e) {
            fail("Exception should not be thrown here");
        }
    }

}