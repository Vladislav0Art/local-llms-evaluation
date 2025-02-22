package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildTest_NoQueryString_ReturnsExpectedUrl {

    @Test
    public void buildTest_NoQueryString_ReturnsExpectedUrl() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://example.com");

        URL actualUrl = urlBuilder.build();

        assertEquals(expectedUrl, actualUrl);
    }

}