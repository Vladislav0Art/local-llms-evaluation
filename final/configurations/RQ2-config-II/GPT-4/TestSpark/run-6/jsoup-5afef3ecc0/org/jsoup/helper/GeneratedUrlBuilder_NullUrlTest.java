package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedUrlBuilder_NullUrlTest {

    private final static String TEST_URL = "http://google.com";

    @Test
    public void UrlBuilder_NullUrlTest() {
        new UrlBuilder(null);
    }

}