package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildTestMalformedURLException {

    @Test
    public void buildTestMalformedURLException() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
    }

}