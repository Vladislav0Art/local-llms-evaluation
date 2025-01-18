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
public class GeneratedBuild_ValidURLTest {

    @Mock
    private Connection.KeyVal keyVal;

    @Test
    public void build_ValidURLTest() {
        try {
            URL url = new URL("https://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            URL builtURL = urlBuilder.build();
            assertEquals("https://www.example.com", builtURL.toString());
        } catch (MalformedURLException e) {
            fail("Exception should not be thrown here");
        }
    }

}