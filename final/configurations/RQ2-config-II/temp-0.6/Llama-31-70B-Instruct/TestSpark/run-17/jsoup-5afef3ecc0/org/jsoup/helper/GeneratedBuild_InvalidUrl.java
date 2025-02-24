package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuild_InvalidUrl {

    // Tests for the build() method

    @Test
    public void build_InvalidUrl() throws Exception {
        URL inputUrl = new URL("invalid url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build(); // throws MalformedURLException
    }

}