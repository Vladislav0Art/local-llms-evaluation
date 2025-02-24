package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void buildUrlTest() throws URISyntaxException {
        // Arrange
        URL url = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        // Act
        URL result = urlBuilder.build();

        // Assert
        Assert.assertEquals(url, result);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        // Arrange
        URL url = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        // Act
        urlBuilder.appendKeyVal(null);
    }

}