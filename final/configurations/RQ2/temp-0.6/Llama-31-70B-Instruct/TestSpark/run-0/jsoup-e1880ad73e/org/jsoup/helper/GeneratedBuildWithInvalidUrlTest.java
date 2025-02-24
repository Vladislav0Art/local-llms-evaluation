package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedBuildWithInvalidUrlTest {

    private static final String URL_STRING = "https://www.example.com";
    private static final String KEY = "key";
    private static final String VALUE = "value";

    @Test
    public void buildWithInvalidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("invalid url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

}