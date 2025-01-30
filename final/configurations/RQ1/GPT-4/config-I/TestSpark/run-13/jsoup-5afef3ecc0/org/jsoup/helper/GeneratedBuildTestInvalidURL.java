package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildTestInvalidURL {

    @Test
    public void buildTestInvalidURL() throws MalformedURLException {
        URL inputUrl = new URL("http::invalid_url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL result = urlBuilder.build();
    }

}