package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedBuildWithValidUrlTest {

    private static final String URL_STRING = "https://www.example.com";
    private static final String KEY = "key";
    private static final String VALUE = "value";

    @Test
    public void buildWithValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL(URL_STRING);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        Assert.assertEquals(inputUrl.toExternalForm(), resultUrl.toExternalForm());
    }

}