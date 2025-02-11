package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class GeneratedBuildWithInvalidUrl TestUrlBuilderBuildWithInvalidUrl {

    @Test
    public void buildWithInvalidUrl

    TestUrlBuilderBuildWithInvalidUrl() throws MalformedURLException, URISyntaxException {
        new UrlBuilder(new URL("http://a%20b.com"));
    }

}