package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        URL input = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(input);
        Assert.assertNotNull(urlBuilder);
    }

}