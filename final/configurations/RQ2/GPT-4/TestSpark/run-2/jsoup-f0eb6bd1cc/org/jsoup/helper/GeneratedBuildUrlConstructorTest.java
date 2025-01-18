package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildUrlConstructorTest {

    @Test
    public void buildUrlConstructorTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder);
    }

}