package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildTest_WithQueryString_ReturnsExpectedUrl {

    @Test
    public void buildTest_WithQueryString_ReturnsExpectedUrl() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com?key1=value1&key2=value2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://example.com?key1=value1&key2=value2");

        URL actualUrl = urlBuilder.build();

        assertEquals(expectedUrl, actualUrl);
    }

}