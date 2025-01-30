package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildTest_WithoutQuery {

    @Test
    public void buildTest_WithoutQuery() throws MalformedURLException {
        UrlBuilder testInstance = new UrlBuilder(new URL("https://www.example.com/test"));
        URL resultUrl = testInstance.build();
        Assert.assertEquals("https://www.example.com/test", resultUrl.toString());
    }

}