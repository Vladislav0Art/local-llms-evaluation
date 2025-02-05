package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildWithoutInputUrlTest {

    @Test
    public void buildWithoutInputUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.build();
    }

}