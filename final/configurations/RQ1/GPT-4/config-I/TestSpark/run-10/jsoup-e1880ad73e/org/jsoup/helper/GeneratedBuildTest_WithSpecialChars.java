package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildTest_WithSpecialChars {

    @Test
    public void buildTest_WithSpecialChars() throws MalformedURLException {
        UrlBuilder testInstance = new UrlBuilder(new URL("https://www.example.com/test/äöü?param=value"));
        URL resultUrl = testInstance.build();
        Assert.assertEquals("https://www.example.com/test/%C3%A4%C3%B6%C3%BC?param=value", resultUrl.toString());
    }

}