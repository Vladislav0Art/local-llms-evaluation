package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.*;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderConstructorWithValidUrlTest {

    @Test
    public void UrlBuilderConstructorWithValidUrlTest() {
        try {
            URL url = new URL("http://test.com/subpage");
            UrlBuilder builder = new UrlBuilder(url);
            assertNotNull(builder);
        } catch (MalformedURLException e) {
            fail();
        }
    }

}