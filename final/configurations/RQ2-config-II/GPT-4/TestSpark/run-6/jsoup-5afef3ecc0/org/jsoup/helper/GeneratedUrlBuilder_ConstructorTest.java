package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedUrlBuilder_ConstructorTest {

    private final static String TEST_URL = "http://google.com";

    @Test
    public void UrlBuilder_ConstructorTest() throws Exception {
        UrlBuilder target = new UrlBuilder(new URL(TEST_URL));
        Assert.assertNotNull(target);
    }

}