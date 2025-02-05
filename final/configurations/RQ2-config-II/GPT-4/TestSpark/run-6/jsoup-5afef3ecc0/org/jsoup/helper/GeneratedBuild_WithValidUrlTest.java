package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedBuild_WithValidUrlTest {

    private final static String TEST_URL = "http://google.com";

    @Test
    public void build_WithValidUrlTest() throws Exception {
        UrlBuilder target = new UrlBuilder(new URL(TEST_URL));
        URL result = target.build();
        Assert.assertNotNull(result);
        Assert.assertEquals(TEST_URL, result.toString());
    }

}