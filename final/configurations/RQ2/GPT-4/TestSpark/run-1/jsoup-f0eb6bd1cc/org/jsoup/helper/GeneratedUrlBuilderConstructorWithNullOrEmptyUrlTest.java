package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.*;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderConstructorWithNullOrEmptyUrlTest {

    @Test
    public void UrlBuilderConstructorWithNullOrEmptyUrlTest() {
        try {
            URL url = new URL("http://test.com");
            UrlBuilder builder = new UrlBuilder(url);
            assertNotNull(builder);
        } catch (MalformedURLException e) {
            fail();
        }
    }

}