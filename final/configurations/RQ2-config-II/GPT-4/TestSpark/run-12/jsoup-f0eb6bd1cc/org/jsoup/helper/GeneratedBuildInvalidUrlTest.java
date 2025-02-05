package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import org.jsoup.Connection;
import org.mockito.Mockito;

public class GeneratedBuildInvalidUrlTest {

    @Test
    public void buildInvalidUrlTest() {
        URL url = new URL("htps:www.test.com");
        UrlBuilder builder = new UrlBuilder(url);
        URL resultUrl = builder.build();
        assertNotEquals(url, resultUrl);
    }

}