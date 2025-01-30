package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildNonAsciiQueryTest {

    @Test
    public void BuildNonAsciiQueryTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com/search?q=тест");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        Assert.assertNotEquals("http://www.google.com/search?q=тест", result.toString());
        Assert.assertEquals("http://www.google.com/search?q=%D1%82%D0%B5%D1%81%D1%82", result.toString());
    }

}