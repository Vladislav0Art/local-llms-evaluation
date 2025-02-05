package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import org.jsoup.Connection;
import org.mockito.Mockito;

public class GeneratedUrlBuilderConstructorWithUrlTest {

    @Test
    public void UrlBuilderConstructorWithUrlTest() {
        URL url = new URL("https://www.test.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder);
    }

}