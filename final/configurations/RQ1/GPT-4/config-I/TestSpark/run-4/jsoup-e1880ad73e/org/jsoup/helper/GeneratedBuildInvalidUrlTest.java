package org.jsoup.helper;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildInvalidUrlTest {

    @Test
    public void buildInvalidUrlTest() throws MalformedURLException {
        URL url = new URL("ftp://invalid_url");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

}